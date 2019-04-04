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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import us.AcceptanceTest;
import us.BacklogItem;
import us.Epic;
import us.Link;
import us.STATE;
import us.UsPackage;
import us.UserStory;
import us.What;
import us.Who;
import us.Why;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Story</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.impl.UserStoryImpl#getStoryPoints <em>Story Points</em>}</li>
 *   <li>{@link us.impl.UserStoryImpl#getState <em>State</em>}</li>
 *   <li>{@link us.impl.UserStoryImpl#getConversation <em>Conversation</em>}</li>
 *   <li>{@link us.impl.UserStoryImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link us.impl.UserStoryImpl#getRole <em>Role</em>}</li>
 *   <li>{@link us.impl.UserStoryImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link us.impl.UserStoryImpl#getAcceptanceTest <em>Acceptance Test</em>}</li>
 *   <li>{@link us.impl.UserStoryImpl#getTask <em>Task</em>}</li>
 *   <li>{@link us.impl.UserStoryImpl#getLink <em>Link</em>}</li>
 *   <li>{@link us.impl.UserStoryImpl#getEpic <em>Epic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserStoryImpl extends NamedElementImpl implements UserStory {
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
	protected UserStoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsPackage.Literals.USER_STORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__STORY_POINTS, oldStoryPoints, storyPoints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__CONVERSATION, oldConversation, conversation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__PRIORITY, oldPriority, priority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__ROLE, oldRole, newRole);
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
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsPackage.USER_STORY__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsPackage.USER_STORY__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__ROLE, newRole, newRole));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__GOAL, oldGoal, newGoal);
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
				msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsPackage.USER_STORY__GOAL, null, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsPackage.USER_STORY__GOAL, null, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__GOAL, newGoal, newGoal));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__ACCEPTANCE_TEST, oldAcceptanceTest, newAcceptanceTest);
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
				msgs = ((InternalEObject)acceptanceTest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsPackage.USER_STORY__ACCEPTANCE_TEST, null, msgs);
			if (newAcceptanceTest != null)
				msgs = ((InternalEObject)newAcceptanceTest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsPackage.USER_STORY__ACCEPTANCE_TEST, null, msgs);
			msgs = basicSetAcceptanceTest(newAcceptanceTest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__ACCEPTANCE_TEST, newAcceptanceTest, newAcceptanceTest));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__TASK, oldTask, newTask);
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
				msgs = ((InternalEObject)task).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsPackage.USER_STORY__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsPackage.USER_STORY__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, UsPackage.USER_STORY__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Epic getEpic() {
		if (eContainerFeatureID() != UsPackage.USER_STORY__EPIC) return null;
		return (Epic)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpic(Epic newEpic, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEpic, UsPackage.USER_STORY__EPIC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpic(Epic newEpic) {
		if (newEpic != eInternalContainer() || (eContainerFeatureID() != UsPackage.USER_STORY__EPIC && newEpic != null)) {
			if (EcoreUtil.isAncestor(this, newEpic))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEpic != null)
				msgs = ((InternalEObject)newEpic).eInverseAdd(this, UsPackage.EPIC__USER_STORIES, Epic.class, msgs);
			msgs = basicSetEpic(newEpic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.USER_STORY__EPIC, newEpic, newEpic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsPackage.USER_STORY__EPIC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEpic((Epic)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsPackage.USER_STORY__ROLE:
				return basicSetRole(null, msgs);
			case UsPackage.USER_STORY__GOAL:
				return basicSetGoal(null, msgs);
			case UsPackage.USER_STORY__ACCEPTANCE_TEST:
				return basicSetAcceptanceTest(null, msgs);
			case UsPackage.USER_STORY__TASK:
				return basicSetTask(null, msgs);
			case UsPackage.USER_STORY__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case UsPackage.USER_STORY__EPIC:
				return basicSetEpic(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UsPackage.USER_STORY__EPIC:
				return eInternalContainer().eInverseRemove(this, UsPackage.EPIC__USER_STORIES, Epic.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsPackage.USER_STORY__STORY_POINTS:
				return getStoryPoints();
			case UsPackage.USER_STORY__STATE:
				return getState();
			case UsPackage.USER_STORY__CONVERSATION:
				return getConversation();
			case UsPackage.USER_STORY__PRIORITY:
				return getPriority();
			case UsPackage.USER_STORY__ROLE:
				return getRole();
			case UsPackage.USER_STORY__GOAL:
				return getGoal();
			case UsPackage.USER_STORY__ACCEPTANCE_TEST:
				return getAcceptanceTest();
			case UsPackage.USER_STORY__TASK:
				return getTask();
			case UsPackage.USER_STORY__LINK:
				return getLink();
			case UsPackage.USER_STORY__EPIC:
				return getEpic();
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
			case UsPackage.USER_STORY__STORY_POINTS:
				setStoryPoints((Integer)newValue);
				return;
			case UsPackage.USER_STORY__STATE:
				setState((STATE)newValue);
				return;
			case UsPackage.USER_STORY__CONVERSATION:
				setConversation((String)newValue);
				return;
			case UsPackage.USER_STORY__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case UsPackage.USER_STORY__ROLE:
				setRole((Who)newValue);
				return;
			case UsPackage.USER_STORY__GOAL:
				setGoal((Why)newValue);
				return;
			case UsPackage.USER_STORY__ACCEPTANCE_TEST:
				setAcceptanceTest((AcceptanceTest)newValue);
				return;
			case UsPackage.USER_STORY__TASK:
				setTask((What)newValue);
				return;
			case UsPackage.USER_STORY__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case UsPackage.USER_STORY__EPIC:
				setEpic((Epic)newValue);
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
			case UsPackage.USER_STORY__STORY_POINTS:
				setStoryPoints(STORY_POINTS_EDEFAULT);
				return;
			case UsPackage.USER_STORY__STATE:
				setState(STATE_EDEFAULT);
				return;
			case UsPackage.USER_STORY__CONVERSATION:
				setConversation(CONVERSATION_EDEFAULT);
				return;
			case UsPackage.USER_STORY__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case UsPackage.USER_STORY__ROLE:
				setRole((Who)null);
				return;
			case UsPackage.USER_STORY__GOAL:
				setGoal((Why)null);
				return;
			case UsPackage.USER_STORY__ACCEPTANCE_TEST:
				setAcceptanceTest((AcceptanceTest)null);
				return;
			case UsPackage.USER_STORY__TASK:
				setTask((What)null);
				return;
			case UsPackage.USER_STORY__LINK:
				getLink().clear();
				return;
			case UsPackage.USER_STORY__EPIC:
				setEpic((Epic)null);
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
			case UsPackage.USER_STORY__STORY_POINTS:
				return storyPoints != STORY_POINTS_EDEFAULT;
			case UsPackage.USER_STORY__STATE:
				return state != STATE_EDEFAULT;
			case UsPackage.USER_STORY__CONVERSATION:
				return CONVERSATION_EDEFAULT == null ? conversation != null : !CONVERSATION_EDEFAULT.equals(conversation);
			case UsPackage.USER_STORY__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case UsPackage.USER_STORY__ROLE:
				return role != null;
			case UsPackage.USER_STORY__GOAL:
				return goal != null;
			case UsPackage.USER_STORY__ACCEPTANCE_TEST:
				return acceptanceTest != null;
			case UsPackage.USER_STORY__TASK:
				return task != null;
			case UsPackage.USER_STORY__LINK:
				return link != null && !link.isEmpty();
			case UsPackage.USER_STORY__EPIC:
				return getEpic() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BacklogItem.class) {
			switch (derivedFeatureID) {
				case UsPackage.USER_STORY__STORY_POINTS: return UsPackage.BACKLOG_ITEM__STORY_POINTS;
				case UsPackage.USER_STORY__STATE: return UsPackage.BACKLOG_ITEM__STATE;
				case UsPackage.USER_STORY__CONVERSATION: return UsPackage.BACKLOG_ITEM__CONVERSATION;
				case UsPackage.USER_STORY__PRIORITY: return UsPackage.BACKLOG_ITEM__PRIORITY;
				case UsPackage.USER_STORY__ROLE: return UsPackage.BACKLOG_ITEM__ROLE;
				case UsPackage.USER_STORY__GOAL: return UsPackage.BACKLOG_ITEM__GOAL;
				case UsPackage.USER_STORY__ACCEPTANCE_TEST: return UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST;
				case UsPackage.USER_STORY__TASK: return UsPackage.BACKLOG_ITEM__TASK;
				case UsPackage.USER_STORY__LINK: return UsPackage.BACKLOG_ITEM__LINK;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BacklogItem.class) {
			switch (baseFeatureID) {
				case UsPackage.BACKLOG_ITEM__STORY_POINTS: return UsPackage.USER_STORY__STORY_POINTS;
				case UsPackage.BACKLOG_ITEM__STATE: return UsPackage.USER_STORY__STATE;
				case UsPackage.BACKLOG_ITEM__CONVERSATION: return UsPackage.USER_STORY__CONVERSATION;
				case UsPackage.BACKLOG_ITEM__PRIORITY: return UsPackage.USER_STORY__PRIORITY;
				case UsPackage.BACKLOG_ITEM__ROLE: return UsPackage.USER_STORY__ROLE;
				case UsPackage.BACKLOG_ITEM__GOAL: return UsPackage.USER_STORY__GOAL;
				case UsPackage.BACKLOG_ITEM__ACCEPTANCE_TEST: return UsPackage.USER_STORY__ACCEPTANCE_TEST;
				case UsPackage.BACKLOG_ITEM__TASK: return UsPackage.USER_STORY__TASK;
				case UsPackage.BACKLOG_ITEM__LINK: return UsPackage.USER_STORY__LINK;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //UserStoryImpl
