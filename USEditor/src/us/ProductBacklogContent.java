/**
 */
package us;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Backlog Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.ProductBacklogContent#getElements <em>Elements</em>}</li>
 *   <li>{@link us.ProductBacklogContent#getThemes <em>Themes</em>}</li>
 * </ul>
 *
 * @see us.UsPackage#getProductBacklogContent()
 * @model
 * @generated
 */
public interface ProductBacklogContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link us.BacklogItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see us.UsPackage#getProductBacklogContent_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BacklogItem> getElements();

	/**
	 * Returns the value of the '<em><b>Themes</b></em>' containment reference list.
	 * The list contents are of type {@link us.Theme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Themes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Themes</em>' containment reference list.
	 * @see us.UsPackage#getProductBacklogContent_Themes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Theme> getThemes();

} // ProductBacklogContent
