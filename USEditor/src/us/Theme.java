/**
 */
package us;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.Theme#getEpic <em>Epic</em>}</li>
 * </ul>
 *
 * @see us.UsPackage#getTheme()
 * @model
 * @generated
 */
public interface Theme extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Epic</b></em>' containment reference list.
	 * The list contents are of type {@link us.Epic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epic</em>' containment reference list.
	 * @see us.UsPackage#getTheme_Epic()
	 * @model containment="true"
	 * @generated
	 */
	EList<Epic> getEpic();

} // Theme
