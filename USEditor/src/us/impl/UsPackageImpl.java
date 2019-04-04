/**
 */
package us.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import us.AcceptanceTest;
import us.BacklogItem;
import us.Epic;
import us.Link;
import us.NamedElement;
import us.ProductBacklog;
import us.ProductBacklogContent;
import us.ProductBacklogHeader;
import us.Theme;
import us.UsFactory;
import us.UsPackage;
import us.UserStory;
import us.What;
import us.Who;
import us.Why;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsPackageImpl extends EPackageImpl implements UsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass themeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userStoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptanceTestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productBacklogHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backlogItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productBacklogContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productBacklogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see us.UsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsPackageImpl() {
		super(eNS_URI, UsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsPackage init() {
		if (isInited) return (UsPackage)EPackage.Registry.INSTANCE.getEPackage(UsPackage.eNS_URI);

		// Obtain or create and register package
		UsPackageImpl theUsPackage = (UsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUsPackage.createPackageContents();

		// Initialize created meta-data
		theUsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsPackage.eNS_URI, theUsPackage);
		return theUsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheme() {
		return themeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheme_Epic() {
		return (EReference)themeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserStory() {
		return userStoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserStory_Epic() {
		return (EReference)userStoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptanceTest() {
		return acceptanceTestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEpic() {
		return epicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEpic_UserStories() {
		return (EReference)epicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWho() {
		return whoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhat() {
		return whatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhy() {
		return whyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductBacklogHeader() {
		return productBacklogHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductBacklogHeader_Comment() {
		return (EAttribute)productBacklogHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductBacklogHeader_CreationDate() {
		return (EAttribute)productBacklogHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductBacklogHeader_LastUpdate() {
		return (EAttribute)productBacklogHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductBacklogHeader_Tool() {
		return (EAttribute)productBacklogHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductBacklogHeader_Name() {
		return (EAttribute)productBacklogHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBacklogItem() {
		return backlogItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBacklogItem_StoryPoints() {
		return (EAttribute)backlogItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBacklogItem_State() {
		return (EAttribute)backlogItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBacklogItem_Conversation() {
		return (EAttribute)backlogItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBacklogItem_Priority() {
		return (EAttribute)backlogItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBacklogItem_Role() {
		return (EReference)backlogItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBacklogItem_Goal() {
		return (EReference)backlogItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBacklogItem_AcceptanceTest() {
		return (EReference)backlogItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBacklogItem_Task() {
		return (EReference)backlogItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBacklogItem_Link() {
		return (EReference)backlogItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductBacklogContent() {
		return productBacklogContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductBacklogContent_Elements() {
		return (EReference)productBacklogContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductBacklogContent_Themes() {
		return (EReference)productBacklogContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductBacklog() {
		return productBacklogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductBacklog_Content() {
		return (EReference)productBacklogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductBacklog_Header() {
		return (EReference)productBacklogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSTATE() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsFactory getUsFactory() {
		return (UsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		themeEClass = createEClass(THEME);
		createEReference(themeEClass, THEME__EPIC);

		userStoryEClass = createEClass(USER_STORY);
		createEReference(userStoryEClass, USER_STORY__EPIC);

		acceptanceTestEClass = createEClass(ACCEPTANCE_TEST);

		linkEClass = createEClass(LINK);

		epicEClass = createEClass(EPIC);
		createEReference(epicEClass, EPIC__USER_STORIES);

		whoEClass = createEClass(WHO);

		whatEClass = createEClass(WHAT);

		whyEClass = createEClass(WHY);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		productBacklogHeaderEClass = createEClass(PRODUCT_BACKLOG_HEADER);
		createEAttribute(productBacklogHeaderEClass, PRODUCT_BACKLOG_HEADER__COMMENT);
		createEAttribute(productBacklogHeaderEClass, PRODUCT_BACKLOG_HEADER__CREATION_DATE);
		createEAttribute(productBacklogHeaderEClass, PRODUCT_BACKLOG_HEADER__LAST_UPDATE);
		createEAttribute(productBacklogHeaderEClass, PRODUCT_BACKLOG_HEADER__TOOL);
		createEAttribute(productBacklogHeaderEClass, PRODUCT_BACKLOG_HEADER__NAME);

		backlogItemEClass = createEClass(BACKLOG_ITEM);
		createEAttribute(backlogItemEClass, BACKLOG_ITEM__STORY_POINTS);
		createEAttribute(backlogItemEClass, BACKLOG_ITEM__STATE);
		createEAttribute(backlogItemEClass, BACKLOG_ITEM__CONVERSATION);
		createEAttribute(backlogItemEClass, BACKLOG_ITEM__PRIORITY);
		createEReference(backlogItemEClass, BACKLOG_ITEM__ROLE);
		createEReference(backlogItemEClass, BACKLOG_ITEM__GOAL);
		createEReference(backlogItemEClass, BACKLOG_ITEM__ACCEPTANCE_TEST);
		createEReference(backlogItemEClass, BACKLOG_ITEM__TASK);
		createEReference(backlogItemEClass, BACKLOG_ITEM__LINK);

		productBacklogContentEClass = createEClass(PRODUCT_BACKLOG_CONTENT);
		createEReference(productBacklogContentEClass, PRODUCT_BACKLOG_CONTENT__ELEMENTS);
		createEReference(productBacklogContentEClass, PRODUCT_BACKLOG_CONTENT__THEMES);

		productBacklogEClass = createEClass(PRODUCT_BACKLOG);
		createEReference(productBacklogEClass, PRODUCT_BACKLOG__CONTENT);
		createEReference(productBacklogEClass, PRODUCT_BACKLOG__HEADER);

		// Create enums
		stateEEnum = createEEnum(STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		themeEClass.getESuperTypes().add(this.getNamedElement());
		userStoryEClass.getESuperTypes().add(this.getNamedElement());
		userStoryEClass.getESuperTypes().add(this.getBacklogItem());
		acceptanceTestEClass.getESuperTypes().add(this.getNamedElement());
		linkEClass.getESuperTypes().add(this.getNamedElement());
		epicEClass.getESuperTypes().add(this.getNamedElement());
		epicEClass.getESuperTypes().add(this.getBacklogItem());
		whoEClass.getESuperTypes().add(this.getNamedElement());
		whatEClass.getESuperTypes().add(this.getNamedElement());
		whyEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(themeEClass, Theme.class, "Theme", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTheme_Epic(), this.getEpic(), null, "epic", null, 0, -1, Theme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userStoryEClass, UserStory.class, "UserStory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserStory_Epic(), this.getEpic(), this.getEpic_UserStories(), "epic", null, 0, 1, UserStory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(acceptanceTestEClass, AcceptanceTest.class, "AcceptanceTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(epicEClass, Epic.class, "Epic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEpic_UserStories(), this.getUserStory(), this.getUserStory_Epic(), "userStories", null, 1, -1, Epic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whoEClass, Who.class, "Who", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whatEClass, What.class, "What", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whyEClass, Why.class, "Why", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productBacklogHeaderEClass, ProductBacklogHeader.class, "ProductBacklogHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductBacklogHeader_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, ProductBacklogHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductBacklogHeader_CreationDate(), ecorePackage.getEDate(), "creationDate", null, 1, 1, ProductBacklogHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductBacklogHeader_LastUpdate(), ecorePackage.getEDate(), "lastUpdate", null, 1, 1, ProductBacklogHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductBacklogHeader_Tool(), ecorePackage.getEString(), "tool", null, 0, 1, ProductBacklogHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductBacklogHeader_Name(), ecorePackage.getEString(), "name", null, 1, 1, ProductBacklogHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(backlogItemEClass, BacklogItem.class, "BacklogItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBacklogItem_StoryPoints(), ecorePackage.getEInt(), "storyPoints", null, 0, 1, BacklogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBacklogItem_State(), this.getSTATE(), "state", null, 0, 1, BacklogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBacklogItem_Conversation(), ecorePackage.getEString(), "conversation", null, 0, 1, BacklogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBacklogItem_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, BacklogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBacklogItem_Role(), this.getWho(), null, "role", null, 1, 1, BacklogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBacklogItem_Goal(), this.getWhy(), null, "goal", null, 0, 1, BacklogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBacklogItem_AcceptanceTest(), this.getAcceptanceTest(), null, "acceptanceTest", null, 0, 1, BacklogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBacklogItem_Task(), this.getWhat(), null, "task", null, 1, 1, BacklogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBacklogItem_Link(), this.getLink(), null, "link", null, 0, -1, BacklogItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productBacklogContentEClass, ProductBacklogContent.class, "ProductBacklogContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductBacklogContent_Elements(), this.getBacklogItem(), null, "elements", null, 1, -1, ProductBacklogContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductBacklogContent_Themes(), this.getTheme(), null, "themes", null, 0, -1, ProductBacklogContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productBacklogEClass, ProductBacklog.class, "ProductBacklog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductBacklog_Content(), this.getProductBacklogContent(), null, "content", null, 1, 1, ProductBacklog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductBacklog_Header(), this.getProductBacklogHeader(), null, "header", null, 1, 1, ProductBacklog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, us.STATE.class, "STATE");
		addEEnumLiteral(stateEEnum, us.STATE.DONE);
		addEEnumLiteral(stateEEnum, us.STATE.PLANNED);
		addEEnumLiteral(stateEEnum, us.STATE.INPROGRESS);
		addEEnumLiteral(stateEEnum, us.STATE.CANCELED);

		// Create resource
		createResource(eNS_URI);
	}

} //UsPackageImpl
