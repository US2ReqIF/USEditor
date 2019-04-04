/**
 */
package us.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import us.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsFactoryImpl extends EFactoryImpl implements UsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsFactory init() {
		try {
			UsFactory theUsFactory = (UsFactory)EPackage.Registry.INSTANCE.getEFactory(UsPackage.eNS_URI);
			if (theUsFactory != null) {
				return theUsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UsPackage.THEME: return createTheme();
			case UsPackage.USER_STORY: return createUserStory();
			case UsPackage.ACCEPTANCE_TEST: return createAcceptanceTest();
			case UsPackage.LINK: return createLink();
			case UsPackage.EPIC: return createEpic();
			case UsPackage.WHO: return createWho();
			case UsPackage.WHAT: return createWhat();
			case UsPackage.WHY: return createWhy();
			case UsPackage.PRODUCT_BACKLOG_HEADER: return createProductBacklogHeader();
			case UsPackage.PRODUCT_BACKLOG_CONTENT: return createProductBacklogContent();
			case UsPackage.PRODUCT_BACKLOG: return createProductBacklog();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UsPackage.STATE:
				return createSTATEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UsPackage.STATE:
				return convertSTATEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theme createTheme() {
		ThemeImpl theme = new ThemeImpl();
		return theme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStory createUserStory() {
		UserStoryImpl userStory = new UserStoryImpl();
		return userStory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTest createAcceptanceTest() {
		AcceptanceTestImpl acceptanceTest = new AcceptanceTestImpl();
		return acceptanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epic createEpic() {
		EpicImpl epic = new EpicImpl();
		return epic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Who createWho() {
		WhoImpl who = new WhoImpl();
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What createWhat() {
		WhatImpl what = new WhatImpl();
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Why createWhy() {
		WhyImpl why = new WhyImpl();
		return why;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductBacklogHeader createProductBacklogHeader() {
		ProductBacklogHeaderImpl productBacklogHeader = new ProductBacklogHeaderImpl();
		return productBacklogHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductBacklogContent createProductBacklogContent() {
		ProductBacklogContentImpl productBacklogContent = new ProductBacklogContentImpl();
		return productBacklogContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductBacklog createProductBacklog() {
		ProductBacklogImpl productBacklog = new ProductBacklogImpl();
		return productBacklog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STATE createSTATEFromString(EDataType eDataType, String initialValue) {
		STATE result = STATE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTATEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsPackage getUsPackage() {
		return (UsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsPackage getPackage() {
		return UsPackage.eINSTANCE;
	}

} //UsFactoryImpl
