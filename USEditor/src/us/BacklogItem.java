/**
 */
package us;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backlog Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.BacklogItem#getStoryPoints <em>Story Points</em>}</li>
 *   <li>{@link us.BacklogItem#getState <em>State</em>}</li>
 *   <li>{@link us.BacklogItem#getConversation <em>Conversation</em>}</li>
 *   <li>{@link us.BacklogItem#getPriority <em>Priority</em>}</li>
 *   <li>{@link us.BacklogItem#getRole <em>Role</em>}</li>
 *   <li>{@link us.BacklogItem#getGoal <em>Goal</em>}</li>
 *   <li>{@link us.BacklogItem#getAcceptanceTest <em>Acceptance Test</em>}</li>
 *   <li>{@link us.BacklogItem#getTask <em>Task</em>}</li>
 *   <li>{@link us.BacklogItem#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see us.UsPackage#getBacklogItem()
 * @model abstract="true"
 * @generated
 */
public interface BacklogItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Story Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Story Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Story Points</em>' attribute.
	 * @see #setStoryPoints(int)
	 * @see us.UsPackage#getBacklogItem_StoryPoints()
	 * @model
	 * @generated
	 */
	int getStoryPoints();

	/**
	 * Sets the value of the '{@link us.BacklogItem#getStoryPoints <em>Story Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Story Points</em>' attribute.
	 * @see #getStoryPoints()
	 * @generated
	 */
	void setStoryPoints(int value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link us.STATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see us.STATE
	 * @see #setState(STATE)
	 * @see us.UsPackage#getBacklogItem_State()
	 * @model
	 * @generated
	 */
	STATE getState();

	/**
	 * Sets the value of the '{@link us.BacklogItem#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see us.STATE
	 * @see #getState()
	 * @generated
	 */
	void setState(STATE value);

	/**
	 * Returns the value of the '<em><b>Conversation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation</em>' attribute.
	 * @see #setConversation(String)
	 * @see us.UsPackage#getBacklogItem_Conversation()
	 * @model
	 * @generated
	 */
	String getConversation();

	/**
	 * Sets the value of the '{@link us.BacklogItem#getConversation <em>Conversation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversation</em>' attribute.
	 * @see #getConversation()
	 * @generated
	 */
	void setConversation(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see us.UsPackage#getBacklogItem_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link us.BacklogItem#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(Who)
	 * @see us.UsPackage#getBacklogItem_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Who getRole();

	/**
	 * Sets the value of the '{@link us.BacklogItem#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Who value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(Why)
	 * @see us.UsPackage#getBacklogItem_Goal()
	 * @model containment="true"
	 * @generated
	 */
	Why getGoal();

	/**
	 * Sets the value of the '{@link us.BacklogItem#getGoal <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' containment reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Why value);

	/**
	 * Returns the value of the '<em><b>Acceptance Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acceptance Test</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acceptance Test</em>' containment reference.
	 * @see #setAcceptanceTest(AcceptanceTest)
	 * @see us.UsPackage#getBacklogItem_AcceptanceTest()
	 * @model containment="true"
	 * @generated
	 */
	AcceptanceTest getAcceptanceTest();

	/**
	 * Sets the value of the '{@link us.BacklogItem#getAcceptanceTest <em>Acceptance Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acceptance Test</em>' containment reference.
	 * @see #getAcceptanceTest()
	 * @generated
	 */
	void setAcceptanceTest(AcceptanceTest value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference.
	 * @see #setTask(What)
	 * @see us.UsPackage#getBacklogItem_Task()
	 * @model containment="true" required="true"
	 * @generated
	 */
	What getTask();

	/**
	 * Sets the value of the '{@link us.BacklogItem#getTask <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' containment reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(What value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link us.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see us.UsPackage#getBacklogItem_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

} // BacklogItem
