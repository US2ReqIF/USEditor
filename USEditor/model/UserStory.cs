SYNTAXDEF us
FOR <http://www.umu.es/dsdm/requirements/us>
START ProductBacklog


OPTIONS {
	usePredefinedTokens = "false";
	//usePredefinedTokens = "true";
	defaultTokenName = "IDENTIFIER"; 
}


TOKENS {
	DEFINE IDENTIFIER $('A'..'Z' | 'a'..'z' | '-'| '_')('A'..'Z' | 'a'..'z' | '0'..'9' | '-'| '_')*$;
	DEFINE DATE_LITERAL $('0'..'2' '0'..'9' '0'..'9' '0'..'9' '-' '0'..'1' '0'..'9' '-' '0'..'3' '0'..'9' )$;
	DEFINE STRING_LITERAL $('"')(('\\''"')|('\\''\\')|~('"'|'\\'))*('"')$;
	DEFINE WHITESPACE $(' ' | '\t' | '\f')$;
	DEFINE LINEBREAK $('\r\n' | '\r' | '\n')$;
//	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
//	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE ML_COMMENT $'/*'(.*)'*/'$;
}
TOKENSTYLES {
	"PRODUCT", "BACKLOG" COLOR #940016, BOLD;
	"HEADER" COLOR #862633;
	"CONTENT" COLOR #862633;
	"IDENTIFIER" COLOR #5a4e4e, BOLD;
	"USERSTORY", "EPIC", "AS", "A", "AN", "I", "WANT", "TO", "SO", "THAT" COLOR #367276, BOLD;
	"STRING_LITERAL" COLOR #4a570c;
	"DATE_LITERAL" COLOR #e1ad46;
	"DONE" COLOR #A3E721;
	"INPROGRESS" COLOR #87A946;
	"PLANNED"  COLOR #CC7863;
	"CANCELED"  COLOR #940016;
}

RULES {					  				

	ProductBacklog ::= "PRODUCT" "BACKLOG" ":" header content;
	ProductBacklogHeader ::= "HEADER" "{" "name" ":" name[] 
								 ("comment" ":" comment[STRING_LITERAL])?  
								 "creationDate" ":" creationDate[DATE_LITERAL]  
								 "lastUpdate" ":" lastUpdate[DATE_LITERAL]  
								 ("tool" ":" tool[STRING_LITERAL])? 
								 "}";
	ProductBacklogContent::= "CONTENT" "{" ("elements" "{" (elements ";")+ "}")?  ("themes" "{" themes* "}")? "}";
	
	Theme ::= "THEME" name[] ":" "{" epic* "}";
	
	Epic ::=  	"EPIC" 
				("(" state[DONE:"DONE", PLANNED:"PLANNED", INPROGRESS:"INPROGRESS", CANCELED:"CANCELED"] ")")?
				":" name[] "=" role task goal? ("[" userStories "]")+
				  		 ("{"	("storyPoints" ":" storyPoints[])?
				  	  			("conversation" ":" conversation[])?
				  	  			("priority" ":" priority[])?  
				  	  			(acceptanceTest)? 
				  	  			(link)?
				  	  	"}")?;

	UserStory ::= "USERSTORY" 
	 			 	("(" state[DONE:"DONE", PLANNED:"PLANNED", INPROGRESS:"INPROGRESS", CANCELED:"CANCELED"] ")")? 
	 			 	":" name[] "=" role task goal? 
				  		 ("{"	("storyPoints" ":" storyPoints[])?
				  	  		("conversation" ":" conversation[])?
				  	  		("priority" ":" priority[])?  
				  	  		(acceptanceTest)? 
				  	  		(link)?
				  	  	"}")?;
	Who ::= "AS"("A"|"AN") name[];
	What ::= "I" "WANT" "TO" name[STRING_LITERAL];
	Why ::= "SO" "THAT" name[STRING_LITERAL];

	AcceptanceTest ::= "ACCEPTANCETEST" "=" name[STRING_LITERAL] ";";
	Link ::= "LINK" "="  name[STRING_LITERAL] ";";	
}