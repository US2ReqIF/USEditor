/**
 */
package us;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see us.UsFactory
 * @model kind="package"
 * @generated
 */
public interface UsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "us";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.umu.es/dsdm/requirements/us";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "us";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsPackage eINSTANCE = us.impl.UsPackageImpl.init();

	/**
	 * The meta object id for the '{@link us.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.NamedElementImpl
	 * @see us.impl.UsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.impl.ThemeImpl <em>Theme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.ThemeImpl
	 * @see us.impl.UsPackageImpl#getTheme()
	 * @generated
	 */
	int THEME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Epic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME__EPIC = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Theme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Theme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEME_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.impl.UserStoryImpl <em>User Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.UserStoryImpl
	 * @see us.impl.UsPackageImpl#getUserStory()
	 * @generated
	 */
	int USER_STORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Story Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__STORY_POINTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__STATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conversation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__CONVERSATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__PRIORITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ROLE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__GOAL = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ACCEPTANCE_TEST = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__TASK = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__LINK = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Epic</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__EPIC = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.impl.AcceptanceTestImpl <em>Acceptance Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.AcceptanceTestImpl
	 * @see us.impl.UsPackageImpl#getAcceptanceTest()
	 * @generated
	 */
	int ACCEPTANCE_TEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Acceptance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Acceptance Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTANCE_TEST_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.LinkImpl
	 * @see us.impl.UsPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.impl.BacklogItemImpl <em>Backlog Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.BacklogItemImpl
	 * @see us.impl.UsPackageImpl#getBacklogItem()
	 * @generated
	 */
	int BACKLOG_ITEM = 10;

	/**
	 * The meta object id for the '{@link us.impl.EpicImpl <em>Epic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.EpicImpl
	 * @see us.impl.UsPackageImpl#getEpic()
	 * @generated
	 */
	int EPIC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Story Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__STORY_POINTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__STATE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conversation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__CONVERSATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__PRIORITY = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__ROLE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__GOAL = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__ACCEPTANCE_TEST = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__TASK = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__LINK = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>User Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC__USER_STORIES = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Epic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Epic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPIC_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.impl.WhoImpl <em>Who</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.WhoImpl
	 * @see us.impl.UsPackageImpl#getWho()
	 * @generated
	 */
	int WHO = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Who</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Who</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHO_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.impl.WhatImpl <em>What</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.WhatImpl
	 * @see us.impl.UsPackageImpl#getWhat()
	 * @generated
	 */
	int WHAT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>What</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>What</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.impl.WhyImpl <em>Why</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.WhyImpl
	 * @see us.impl.UsPackageImpl#getWhy()
	 * @generated
	 */
	int WHY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Why</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Why</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link us.impl.ProductBacklogHeaderImpl <em>Product Backlog Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.ProductBacklogHeaderImpl
	 * @see us.impl.UsPackageImpl#getProductBacklogHeader()
	 * @generated
	 */
	int PRODUCT_BACKLOG_HEADER = 9;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_HEADER__COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_HEADER__CREATION_DATE = 1;

	/**
	 * The feature id for the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_HEADER__LAST_UPDATE = 2;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_HEADER__TOOL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_HEADER__NAME = 4;

	/**
	 * The number of structural features of the '<em>Product Backlog Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_HEADER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Product Backlog Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_HEADER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Story Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM__STORY_POINTS = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM__STATE = 1;

	/**
	 * The feature id for the '<em><b>Conversation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM__CONVERSATION = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM__PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM__GOAL = 5;

	/**
	 * The feature id for the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM__ACCEPTANCE_TEST = 6;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM__TASK = 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM__LINK = 8;

	/**
	 * The number of structural features of the '<em>Backlog Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Backlog Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKLOG_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.impl.ProductBacklogContentImpl <em>Product Backlog Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.ProductBacklogContentImpl
	 * @see us.impl.UsPackageImpl#getProductBacklogContent()
	 * @generated
	 */
	int PRODUCT_BACKLOG_CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_CONTENT__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Themes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_CONTENT__THEMES = 1;

	/**
	 * The number of structural features of the '<em>Product Backlog Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product Backlog Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.impl.ProductBacklogImpl <em>Product Backlog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.impl.ProductBacklogImpl
	 * @see us.impl.UsPackageImpl#getProductBacklog()
	 * @generated
	 */
	int PRODUCT_BACKLOG = 12;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG__HEADER = 1;

	/**
	 * The number of structural features of the '<em>Product Backlog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product Backlog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link us.STATE <em>STATE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see us.STATE
	 * @see us.impl.UsPackageImpl#getSTATE()
	 * @generated
	 */
	int STATE = 13;


	/**
	 * Returns the meta object for class '{@link us.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theme</em>'.
	 * @see us.Theme
	 * @generated
	 */
	EClass getTheme();

	/**
	 * Returns the meta object for the containment reference list '{@link us.Theme#getEpic <em>Epic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Epic</em>'.
	 * @see us.Theme#getEpic()
	 * @see #getTheme()
	 * @generated
	 */
	EReference getTheme_Epic();

	/**
	 * Returns the meta object for class '{@link us.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Story</em>'.
	 * @see us.UserStory
	 * @generated
	 */
	EClass getUserStory();

	/**
	 * Returns the meta object for the container reference '{@link us.UserStory#getEpic <em>Epic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Epic</em>'.
	 * @see us.UserStory#getEpic()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Epic();

	/**
	 * Returns the meta object for class '{@link us.AcceptanceTest <em>Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acceptance Test</em>'.
	 * @see us.AcceptanceTest
	 * @generated
	 */
	EClass getAcceptanceTest();

	/**
	 * Returns the meta object for class '{@link us.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see us.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link us.Epic <em>Epic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epic</em>'.
	 * @see us.Epic
	 * @generated
	 */
	EClass getEpic();

	/**
	 * Returns the meta object for the containment reference list '{@link us.Epic#getUserStories <em>User Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User Stories</em>'.
	 * @see us.Epic#getUserStories()
	 * @see #getEpic()
	 * @generated
	 */
	EReference getEpic_UserStories();

	/**
	 * Returns the meta object for class '{@link us.Who <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Who</em>'.
	 * @see us.Who
	 * @generated
	 */
	EClass getWho();

	/**
	 * Returns the meta object for class '{@link us.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What</em>'.
	 * @see us.What
	 * @generated
	 */
	EClass getWhat();

	/**
	 * Returns the meta object for class '{@link us.Why <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Why</em>'.
	 * @see us.Why
	 * @generated
	 */
	EClass getWhy();

	/**
	 * Returns the meta object for class '{@link us.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see us.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link us.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see us.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link us.ProductBacklogHeader <em>Product Backlog Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Backlog Header</em>'.
	 * @see us.ProductBacklogHeader
	 * @generated
	 */
	EClass getProductBacklogHeader();

	/**
	 * Returns the meta object for the attribute '{@link us.ProductBacklogHeader#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see us.ProductBacklogHeader#getComment()
	 * @see #getProductBacklogHeader()
	 * @generated
	 */
	EAttribute getProductBacklogHeader_Comment();

	/**
	 * Returns the meta object for the attribute '{@link us.ProductBacklogHeader#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see us.ProductBacklogHeader#getCreationDate()
	 * @see #getProductBacklogHeader()
	 * @generated
	 */
	EAttribute getProductBacklogHeader_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link us.ProductBacklogHeader#getLastUpdate <em>Last Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update</em>'.
	 * @see us.ProductBacklogHeader#getLastUpdate()
	 * @see #getProductBacklogHeader()
	 * @generated
	 */
	EAttribute getProductBacklogHeader_LastUpdate();

	/**
	 * Returns the meta object for the attribute '{@link us.ProductBacklogHeader#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see us.ProductBacklogHeader#getTool()
	 * @see #getProductBacklogHeader()
	 * @generated
	 */
	EAttribute getProductBacklogHeader_Tool();

	/**
	 * Returns the meta object for the attribute '{@link us.ProductBacklogHeader#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see us.ProductBacklogHeader#getName()
	 * @see #getProductBacklogHeader()
	 * @generated
	 */
	EAttribute getProductBacklogHeader_Name();

	/**
	 * Returns the meta object for class '{@link us.BacklogItem <em>Backlog Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Backlog Item</em>'.
	 * @see us.BacklogItem
	 * @generated
	 */
	EClass getBacklogItem();

	/**
	 * Returns the meta object for the attribute '{@link us.BacklogItem#getStoryPoints <em>Story Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Story Points</em>'.
	 * @see us.BacklogItem#getStoryPoints()
	 * @see #getBacklogItem()
	 * @generated
	 */
	EAttribute getBacklogItem_StoryPoints();

	/**
	 * Returns the meta object for the attribute '{@link us.BacklogItem#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see us.BacklogItem#getState()
	 * @see #getBacklogItem()
	 * @generated
	 */
	EAttribute getBacklogItem_State();

	/**
	 * Returns the meta object for the attribute '{@link us.BacklogItem#getConversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversation</em>'.
	 * @see us.BacklogItem#getConversation()
	 * @see #getBacklogItem()
	 * @generated
	 */
	EAttribute getBacklogItem_Conversation();

	/**
	 * Returns the meta object for the attribute '{@link us.BacklogItem#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see us.BacklogItem#getPriority()
	 * @see #getBacklogItem()
	 * @generated
	 */
	EAttribute getBacklogItem_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link us.BacklogItem#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see us.BacklogItem#getRole()
	 * @see #getBacklogItem()
	 * @generated
	 */
	EReference getBacklogItem_Role();

	/**
	 * Returns the meta object for the containment reference '{@link us.BacklogItem#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Goal</em>'.
	 * @see us.BacklogItem#getGoal()
	 * @see #getBacklogItem()
	 * @generated
	 */
	EReference getBacklogItem_Goal();

	/**
	 * Returns the meta object for the containment reference '{@link us.BacklogItem#getAcceptanceTest <em>Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acceptance Test</em>'.
	 * @see us.BacklogItem#getAcceptanceTest()
	 * @see #getBacklogItem()
	 * @generated
	 */
	EReference getBacklogItem_AcceptanceTest();

	/**
	 * Returns the meta object for the containment reference '{@link us.BacklogItem#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see us.BacklogItem#getTask()
	 * @see #getBacklogItem()
	 * @generated
	 */
	EReference getBacklogItem_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link us.BacklogItem#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see us.BacklogItem#getLink()
	 * @see #getBacklogItem()
	 * @generated
	 */
	EReference getBacklogItem_Link();

	/**
	 * Returns the meta object for class '{@link us.ProductBacklogContent <em>Product Backlog Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Backlog Content</em>'.
	 * @see us.ProductBacklogContent
	 * @generated
	 */
	EClass getProductBacklogContent();

	/**
	 * Returns the meta object for the containment reference list '{@link us.ProductBacklogContent#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see us.ProductBacklogContent#getElements()
	 * @see #getProductBacklogContent()
	 * @generated
	 */
	EReference getProductBacklogContent_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link us.ProductBacklogContent#getThemes <em>Themes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Themes</em>'.
	 * @see us.ProductBacklogContent#getThemes()
	 * @see #getProductBacklogContent()
	 * @generated
	 */
	EReference getProductBacklogContent_Themes();

	/**
	 * Returns the meta object for class '{@link us.ProductBacklog <em>Product Backlog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Backlog</em>'.
	 * @see us.ProductBacklog
	 * @generated
	 */
	EClass getProductBacklog();

	/**
	 * Returns the meta object for the containment reference '{@link us.ProductBacklog#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see us.ProductBacklog#getContent()
	 * @see #getProductBacklog()
	 * @generated
	 */
	EReference getProductBacklog_Content();

	/**
	 * Returns the meta object for the containment reference '{@link us.ProductBacklog#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see us.ProductBacklog#getHeader()
	 * @see #getProductBacklog()
	 * @generated
	 */
	EReference getProductBacklog_Header();

	/**
	 * Returns the meta object for enum '{@link us.STATE <em>STATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STATE</em>'.
	 * @see us.STATE
	 * @generated
	 */
	EEnum getSTATE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsFactory getUsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link us.impl.ThemeImpl <em>Theme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.ThemeImpl
		 * @see us.impl.UsPackageImpl#getTheme()
		 * @generated
		 */
		EClass THEME = eINSTANCE.getTheme();

		/**
		 * The meta object literal for the '<em><b>Epic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEME__EPIC = eINSTANCE.getTheme_Epic();

		/**
		 * The meta object literal for the '{@link us.impl.UserStoryImpl <em>User Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.UserStoryImpl
		 * @see us.impl.UsPackageImpl#getUserStory()
		 * @generated
		 */
		EClass USER_STORY = eINSTANCE.getUserStory();

		/**
		 * The meta object literal for the '<em><b>Epic</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__EPIC = eINSTANCE.getUserStory_Epic();

		/**
		 * The meta object literal for the '{@link us.impl.AcceptanceTestImpl <em>Acceptance Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.AcceptanceTestImpl
		 * @see us.impl.UsPackageImpl#getAcceptanceTest()
		 * @generated
		 */
		EClass ACCEPTANCE_TEST = eINSTANCE.getAcceptanceTest();

		/**
		 * The meta object literal for the '{@link us.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.LinkImpl
		 * @see us.impl.UsPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link us.impl.EpicImpl <em>Epic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.EpicImpl
		 * @see us.impl.UsPackageImpl#getEpic()
		 * @generated
		 */
		EClass EPIC = eINSTANCE.getEpic();

		/**
		 * The meta object literal for the '<em><b>User Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPIC__USER_STORIES = eINSTANCE.getEpic_UserStories();

		/**
		 * The meta object literal for the '{@link us.impl.WhoImpl <em>Who</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.WhoImpl
		 * @see us.impl.UsPackageImpl#getWho()
		 * @generated
		 */
		EClass WHO = eINSTANCE.getWho();

		/**
		 * The meta object literal for the '{@link us.impl.WhatImpl <em>What</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.WhatImpl
		 * @see us.impl.UsPackageImpl#getWhat()
		 * @generated
		 */
		EClass WHAT = eINSTANCE.getWhat();

		/**
		 * The meta object literal for the '{@link us.impl.WhyImpl <em>Why</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.WhyImpl
		 * @see us.impl.UsPackageImpl#getWhy()
		 * @generated
		 */
		EClass WHY = eINSTANCE.getWhy();

		/**
		 * The meta object literal for the '{@link us.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.NamedElementImpl
		 * @see us.impl.UsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link us.impl.ProductBacklogHeaderImpl <em>Product Backlog Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.ProductBacklogHeaderImpl
		 * @see us.impl.UsPackageImpl#getProductBacklogHeader()
		 * @generated
		 */
		EClass PRODUCT_BACKLOG_HEADER = eINSTANCE.getProductBacklogHeader();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_BACKLOG_HEADER__COMMENT = eINSTANCE.getProductBacklogHeader_Comment();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_BACKLOG_HEADER__CREATION_DATE = eINSTANCE.getProductBacklogHeader_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Last Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_BACKLOG_HEADER__LAST_UPDATE = eINSTANCE.getProductBacklogHeader_LastUpdate();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_BACKLOG_HEADER__TOOL = eINSTANCE.getProductBacklogHeader_Tool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_BACKLOG_HEADER__NAME = eINSTANCE.getProductBacklogHeader_Name();

		/**
		 * The meta object literal for the '{@link us.impl.BacklogItemImpl <em>Backlog Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.BacklogItemImpl
		 * @see us.impl.UsPackageImpl#getBacklogItem()
		 * @generated
		 */
		EClass BACKLOG_ITEM = eINSTANCE.getBacklogItem();

		/**
		 * The meta object literal for the '<em><b>Story Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKLOG_ITEM__STORY_POINTS = eINSTANCE.getBacklogItem_StoryPoints();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKLOG_ITEM__STATE = eINSTANCE.getBacklogItem_State();

		/**
		 * The meta object literal for the '<em><b>Conversation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKLOG_ITEM__CONVERSATION = eINSTANCE.getBacklogItem_Conversation();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKLOG_ITEM__PRIORITY = eINSTANCE.getBacklogItem_Priority();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKLOG_ITEM__ROLE = eINSTANCE.getBacklogItem_Role();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKLOG_ITEM__GOAL = eINSTANCE.getBacklogItem_Goal();

		/**
		 * The meta object literal for the '<em><b>Acceptance Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKLOG_ITEM__ACCEPTANCE_TEST = eINSTANCE.getBacklogItem_AcceptanceTest();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKLOG_ITEM__TASK = eINSTANCE.getBacklogItem_Task();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BACKLOG_ITEM__LINK = eINSTANCE.getBacklogItem_Link();

		/**
		 * The meta object literal for the '{@link us.impl.ProductBacklogContentImpl <em>Product Backlog Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.ProductBacklogContentImpl
		 * @see us.impl.UsPackageImpl#getProductBacklogContent()
		 * @generated
		 */
		EClass PRODUCT_BACKLOG_CONTENT = eINSTANCE.getProductBacklogContent();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BACKLOG_CONTENT__ELEMENTS = eINSTANCE.getProductBacklogContent_Elements();

		/**
		 * The meta object literal for the '<em><b>Themes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BACKLOG_CONTENT__THEMES = eINSTANCE.getProductBacklogContent_Themes();

		/**
		 * The meta object literal for the '{@link us.impl.ProductBacklogImpl <em>Product Backlog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.impl.ProductBacklogImpl
		 * @see us.impl.UsPackageImpl#getProductBacklog()
		 * @generated
		 */
		EClass PRODUCT_BACKLOG = eINSTANCE.getProductBacklog();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BACKLOG__CONTENT = eINSTANCE.getProductBacklog_Content();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BACKLOG__HEADER = eINSTANCE.getProductBacklog_Header();

		/**
		 * The meta object literal for the '{@link us.STATE <em>STATE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see us.STATE
		 * @see us.impl.UsPackageImpl#getSTATE()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getSTATE();

	}

} //UsPackage
