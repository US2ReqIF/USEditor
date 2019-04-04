/**
 */
package us;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.UserStory#getEpic <em>Epic</em>}</li>
 * </ul>
 *
 * @see us.UsPackage#getUserStory()
 * @model
 * @generated
 */
public interface UserStory extends NamedElement, BacklogItem {
	/**
	 * Returns the value of the '<em><b>Epic</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link us.Epic#getUserStories <em>User Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epic</em>' container reference.
	 * @see #setEpic(Epic)
	 * @see us.UsPackage#getUserStory_Epic()
	 * @see us.Epic#getUserStories
	 * @model opposite="userStories" transient="false"
	 * @generated
	 */
	Epic getEpic();

	/**
	 * Sets the value of the '{@link us.UserStory#getEpic <em>Epic</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epic</em>' container reference.
	 * @see #getEpic()
	 * @generated
	 */
	void setEpic(Epic value);

} // UserStory
