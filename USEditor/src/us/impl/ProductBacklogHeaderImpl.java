/**
 */
package us.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import us.ProductBacklogHeader;
import us.UsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Backlog Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.impl.ProductBacklogHeaderImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link us.impl.ProductBacklogHeaderImpl#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link us.impl.ProductBacklogHeaderImpl#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link us.impl.ProductBacklogHeaderImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link us.impl.ProductBacklogHeaderImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductBacklogHeaderImpl extends MinimalEObjectImpl.Container implements ProductBacklogHeader {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDate() <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Date creationDate = CREATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdate = LAST_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected String tool = TOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductBacklogHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsPackage.Literals.PRODUCT_BACKLOG_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.PRODUCT_BACKLOG_HEADER__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDate(Date newCreationDate) {
		Date oldCreationDate = creationDate;
		creationDate = newCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.PRODUCT_BACKLOG_HEADER__CREATION_DATE, oldCreationDate, creationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdate(Date newLastUpdate) {
		Date oldLastUpdate = lastUpdate;
		lastUpdate = newLastUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.PRODUCT_BACKLOG_HEADER__LAST_UPDATE, oldLastUpdate, lastUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(String newTool) {
		String oldTool = tool;
		tool = newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.PRODUCT_BACKLOG_HEADER__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsPackage.PRODUCT_BACKLOG_HEADER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsPackage.PRODUCT_BACKLOG_HEADER__COMMENT:
				return getComment();
			case UsPackage.PRODUCT_BACKLOG_HEADER__CREATION_DATE:
				return getCreationDate();
			case UsPackage.PRODUCT_BACKLOG_HEADER__LAST_UPDATE:
				return getLastUpdate();
			case UsPackage.PRODUCT_BACKLOG_HEADER__TOOL:
				return getTool();
			case UsPackage.PRODUCT_BACKLOG_HEADER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsPackage.PRODUCT_BACKLOG_HEADER__COMMENT:
				setComment((String)newValue);
				return;
			case UsPackage.PRODUCT_BACKLOG_HEADER__CREATION_DATE:
				setCreationDate((Date)newValue);
				return;
			case UsPackage.PRODUCT_BACKLOG_HEADER__LAST_UPDATE:
				setLastUpdate((Date)newValue);
				return;
			case UsPackage.PRODUCT_BACKLOG_HEADER__TOOL:
				setTool((String)newValue);
				return;
			case UsPackage.PRODUCT_BACKLOG_HEADER__NAME:
				setName((String)newValue);
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
			case UsPackage.PRODUCT_BACKLOG_HEADER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case UsPackage.PRODUCT_BACKLOG_HEADER__CREATION_DATE:
				setCreationDate(CREATION_DATE_EDEFAULT);
				return;
			case UsPackage.PRODUCT_BACKLOG_HEADER__LAST_UPDATE:
				setLastUpdate(LAST_UPDATE_EDEFAULT);
				return;
			case UsPackage.PRODUCT_BACKLOG_HEADER__TOOL:
				setTool(TOOL_EDEFAULT);
				return;
			case UsPackage.PRODUCT_BACKLOG_HEADER__NAME:
				setName(NAME_EDEFAULT);
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
			case UsPackage.PRODUCT_BACKLOG_HEADER__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case UsPackage.PRODUCT_BACKLOG_HEADER__CREATION_DATE:
				return CREATION_DATE_EDEFAULT == null ? creationDate != null : !CREATION_DATE_EDEFAULT.equals(creationDate);
			case UsPackage.PRODUCT_BACKLOG_HEADER__LAST_UPDATE:
				return LAST_UPDATE_EDEFAULT == null ? lastUpdate != null : !LAST_UPDATE_EDEFAULT.equals(lastUpdate);
			case UsPackage.PRODUCT_BACKLOG_HEADER__TOOL:
				return TOOL_EDEFAULT == null ? tool != null : !TOOL_EDEFAULT.equals(tool);
			case UsPackage.PRODUCT_BACKLOG_HEADER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", creationDate: ");
		result.append(creationDate);
		result.append(", lastUpdate: ");
		result.append(lastUpdate);
		result.append(", tool: ");
		result.append(tool);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProductBacklogHeaderImpl
