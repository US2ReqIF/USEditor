/**
 */
package us;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see us.UsPackage
 * @generated
 */
public interface UsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsFactory eINSTANCE = us.impl.UsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Theme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Theme</em>'.
	 * @generated
	 */
	Theme createTheme();

	/**
	 * Returns a new object of class '<em>User Story</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Story</em>'.
	 * @generated
	 */
	UserStory createUserStory();

	/**
	 * Returns a new object of class '<em>Acceptance Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acceptance Test</em>'.
	 * @generated
	 */
	AcceptanceTest createAcceptanceTest();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Epic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Epic</em>'.
	 * @generated
	 */
	Epic createEpic();

	/**
	 * Returns a new object of class '<em>Who</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Who</em>'.
	 * @generated
	 */
	Who createWho();

	/**
	 * Returns a new object of class '<em>What</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>What</em>'.
	 * @generated
	 */
	What createWhat();

	/**
	 * Returns a new object of class '<em>Why</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Why</em>'.
	 * @generated
	 */
	Why createWhy();

	/**
	 * Returns a new object of class '<em>Product Backlog Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Backlog Header</em>'.
	 * @generated
	 */
	ProductBacklogHeader createProductBacklogHeader();

	/**
	 * Returns a new object of class '<em>Product Backlog Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Backlog Content</em>'.
	 * @generated
	 */
	ProductBacklogContent createProductBacklogContent();

	/**
	 * Returns a new object of class '<em>Product Backlog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Backlog</em>'.
	 * @generated
	 */
	ProductBacklog createProductBacklog();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UsPackage getUsPackage();

} //UsFactory
