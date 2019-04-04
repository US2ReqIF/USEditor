/**
 */
package us.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import us.AcceptanceTest;
import us.BacklogItem;
import us.Link;
import us.STATE;
import us.UsPackage;
import us.What;
import us.Who;
import us.Why;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Backlog Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.impl.BacklogItemImpl#getStoryPoints <em>Story Points</em>}</li>
 *   <li>{@link us.impl.BacklogItemImpl#getState <em>State</em>}</li>
 *   <li>{@link us.impl.BacklogItemImpl#getConversation <em>Conversation</em>}</li>
 *   <li>{@link us.impl.BacklogItemImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link us.impl.BacklogItemImpl#getRole <em>Role</em>}</li>
 *   <li>{@link us.impl.BacklogItemImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link us.impl.BacklogItemImpl#getAcceptanceTest <em>Acceptance Test</em>}</li>
 *   <li>{@link us.impl.BacklogItemImpl#getTask <em>Task</em>}</li>
 *   <li>{@link us.impl.BacklogItemImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BacklogItemImpl extends MinimalEObjectImpl.Container implements BacklogItem {
	/**
	 * The default value of the '{@link #getStoryPoints() <em>Story Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoryPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int STORY_POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStoryPoints() <em>Story Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoryPoints()
	 * @generated
	 * @ordered
	 */
	protected int storyPoints = STORY_POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final STATE STATE_EDEFAULT = STATE.DONE;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected STATE state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConversation() <em>Conversation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversation()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERSATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConversation() <em>Conversation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversation()
	 * @generated
	 * @ordered
	 */
	protected String conversation = CONVERSATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Who role;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected Why goal;

	/**
	 * The cached value of the '{@link #getAcceptanceTest() <em>Acceptance Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceptanceTest()
	 * @generated
	 * @ordered
	 */
	protected AcceptanceTest acceptanceTest;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected What task;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BacklogItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsPackage.Literals.BACKLOG_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStoryPoints() {
		return storyPoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoryPoints(int newStoryPoints) {
		int oldStoryPoints = storyPoints;
		storyPoints = newStoryPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__STORY_POINTS, oldStoryPoints, storyPoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STATE getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(STATE newState) {
		STATE oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConversation() {
		return conversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversation(String newConversation) {
		String oldConversation = conversation;
		conversation = newConversation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__CONVERSATION, oldConversation, conversation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Who getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(Who newRole, NotificationChain msgs) {
		Who oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Who newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsPackage.BACKLOG_ITEM__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsPackage.BACKLOG_ITEM__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Why getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(Why newGoal, NotificationChain msgs) {
		Why oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__GOAL, oldGoal, newGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(Why newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsPackage.BACKLOG_ITEM__GOAL, null, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsPackage.BACKLOG_ITEM__GOAL, null, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptanceTest getAcceptanceTest() {
		return acceptanceTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceptanceTest(AcceptanceTest newAcceptanceTest, NotificationChain msgs) {
		AcceptanceTest oldAcceptanceTest = acceptanceTest;
		acceptanceTest = newAcceptanceTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST, oldAcceptanceTest, newAcceptanceTest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceptanceTest(AcceptanceTest newAcceptanceTest) {
		if (newAcceptanceTest != acceptanceTest) {
			NotificationChain msgs = null;
			if (acceptanceTest != null)
				msgs = ((InternalEObject)acceptanceTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST, null, msgs);
			if (newAcceptanceTest != null)
				msgs = ((InternalEObject)newAcceptanceTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST, null, msgs);
			msgs = basicSetAcceptanceTest(newAcceptanceTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST, newAcceptanceTest, newAcceptanceTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(What newTask, NotificationChain msgs) {
		What oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(What newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsPackage.BACKLOG_ITEM__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsPackage.BACKLOG_ITEM__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.BACKLOG_ITEM__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, UsPackage.BACKLOG_ITEM__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsPackage.BACKLOG_ITEM__ROLE:
				return basicSetRole(null, msgs);
			case UsPackage.BACKLOG_ITEM__GOAL:
				return basicSetGoal(null, msgs);
			case UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST:
				return basicSetAcceptanceTest(null, msgs);
			case UsPackage.BACKLOG_ITEM__TASK:
				return basicSetTask(null, msgs);
			case UsPackage.BACKLOG_ITEM__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsPackage.BACKLOG_ITEM__STORY_POINTS:
				return getStoryPoints();
			case UsPackage.BACKLOG_ITEM__STATE:
				return getState();
			case UsPackage.BACKLOG_ITEM__CONVERSATION:
				return getConversation();
			case UsPackage.BACKLOG_ITEM__PRIORITY:
				return getPriority();
			case UsPackage.BACKLOG_ITEM__ROLE:
				return getRole();
			case UsPackage.BACKLOG_ITEM__GOAL:
				return getGoal();
			case UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST:
				return getAcceptanceTest();
			case UsPackage.BACKLOG_ITEM__TASK:
				return getTask();
			case UsPackage.BACKLOG_ITEM__LINK:
				return getLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsPackage.BACKLOG_ITEM__STORY_POINTS:
				setStoryPoints((Integer)newValue);
				return;
			case UsPackage.BACKLOG_ITEM__STATE:
				setState((STATE)newValue);
				return;
			case UsPackage.BACKLOG_ITEM__CONVERSATION:
				setConversation((String)newValue);
				return;
			case UsPackage.BACKLOG_ITEM__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case UsPackage.BACKLOG_ITEM__ROLE:
				setRole((Who)newValue);
				return;
			case UsPackage.BACKLOG_ITEM__GOAL:
				setGoal((Why)newValue);
				return;
			case UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST:
				setAcceptanceTest((AcceptanceTest)newValue);
				return;
			case UsPackage.BACKLOG_ITEM__TASK:
				setTask((What)newValue);
				return;
			case UsPackage.BACKLOG_ITEM__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsPackage.BACKLOG_ITEM__STORY_POINTS:
				setStoryPoints(STORY_POINTS_EDEFAULT);
				return;
			case UsPackage.BACKLOG_ITEM__STATE:
				setState(STATE_EDEFAULT);
				return;
			case UsPackage.BACKLOG_ITEM__CONVERSATION:
				setConversation(CONVERSATION_EDEFAULT);
				return;
			case UsPackage.BACKLOG_ITEM__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case UsPackage.BACKLOG_ITEM__ROLE:
				setRole((Who)null);
				return;
			case UsPackage.BACKLOG_ITEM__GOAL:
				setGoal((Why)null);
				return;
			case UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST:
				setAcceptanceTest((AcceptanceTest)null);
				return;
			case UsPackage.BACKLOG_ITEM__TASK:
				setTask((What)null);
				return;
			case UsPackage.BACKLOG_ITEM__LINK:
				getLink().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsPackage.BACKLOG_ITEM__STORY_POINTS:
				return storyPoints != STORY_POINTS_EDEFAULT;
			case UsPackage.BACKLOG_ITEM__STATE:
				return state != STATE_EDEFAULT;
			case UsPackage.BACKLOG_ITEM__CONVERSATION:
				return CONVERSATION_EDEFAULT == null ? conversation != null : !CONVERSATION_EDEFAULT.equals(conversation);
			case UsPackage.BACKLOG_ITEM__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case UsPackage.BACKLOG_ITEM__ROLE:
				return role != null;
			case UsPackage.BACKLOG_ITEM__GOAL:
				return goal != null;
			case UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST:
				return acceptanceTest != null;
			case UsPackage.BACKLOG_ITEM__TASK:
				return task != null;
			case UsPackage.BACKLOG_ITEM__LINK:
				return link != null && !link.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (storyPoints: ");
		result.append(storyPoints);
		result.append(", state: ");
		result.append(state);
		result.append(", conversation: ");
		result.append(conversation);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //BacklogItemImpl
