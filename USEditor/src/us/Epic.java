/**
 */
package us;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Epic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.Epic#getUserStories <em>User Stories</em>}</li>
 * </ul>
 *
 * @see us.UsPackage#getEpic()
 * @model
 * @generated
 */
public interface Epic extends NamedElement, BacklogItem {
	/**
	 * Returns the value of the '<em><b>User Stories</b></em>' containment reference list.
	 * The list contents are of type {@link us.UserStory}.
	 * It is bidirectional and its opposite is '{@link us.UserStory#getEpic <em>Epic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Stories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Stories</em>' containment reference list.
	 * @see us.UsPackage#getEpic_UserStories()
	 * @see us.UserStory#getEpic
	 * @model opposite="epic" containment="true" required="true"
	 * @generated
	 */
	EList<UserStory> getUserStories();

} // Epic
