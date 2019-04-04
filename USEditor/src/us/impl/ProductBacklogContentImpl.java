/**
 */
package us.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import us.BacklogItem;
import us.ProductBacklogContent;
import us.Theme;
import us.UsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Backlog Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link us.impl.ProductBacklogContentImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link us.impl.ProductBacklogContentImpl#getThemes <em>Themes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductBacklogContentImpl extends MinimalEObjectImpl.Container implements ProductBacklogContent {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<BacklogItem> elements;

	/**
	 * The cached value of the '{@link #getThemes() <em>Themes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThemes()
	 * @generated
	 * @ordered
	 */
	protected EList<Theme> themes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductBacklogContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsPackage.Literals.PRODUCT_BACKLOG_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BacklogItem> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<BacklogItem>(BacklogItem.class, this, UsPackage.PRODUCT_BACKLOG_CONTENT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Theme> getThemes() {
		if (themes == null) {
			themes = new EObjectContainmentEList<Theme>(Theme.class, this, UsPackage.PRODUCT_BACKLOG_CONTENT__THEMES);
		}
		return themes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsPackage.PRODUCT_BACKLOG_CONTENT__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case UsPackage.PRODUCT_BACKLOG_CONTENT__THEMES:
				return ((InternalEList<?>)getThemes()).basicRemove(otherEnd, msgs);
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
			case UsPackage.PRODUCT_BACKLOG_CONTENT__ELEMENTS:
				return getElements();
			case UsPackage.PRODUCT_BACKLOG_CONTENT__THEMES:
				return getThemes();
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
			case UsPackage.PRODUCT_BACKLOG_CONTENT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends BacklogItem>)newValue);
				return;
			case UsPackage.PRODUCT_BACKLOG_CONTENT__THEMES:
				getThemes().clear();
				getThemes().addAll((Collection<? extends Theme>)newValue);
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
			case UsPackage.PRODUCT_BACKLOG_CONTENT__ELEMENTS:
				getElements().clear();
				return;
			case UsPackage.PRODUCT_BACKLOG_CONTENT__THEMES:
				getThemes().clear();
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
			case UsPackage.PRODUCT_BACKLOG_CONTENT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case UsPackage.PRODUCT_BACKLOG_CONTENT__THEMES:
				return themes != null && !themes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductBacklogContentImpl
