/**
 */
package us.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import us.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see us.UsPackage
 * @generated
 */
public class UsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsSwitch<Adapter> modelSwitch =
		new UsSwitch<Adapter>() {
			@Override
			public Adapter caseTheme(Theme object) {
				return createThemeAdapter();
			}
			@Override
			public Adapter caseUserStory(UserStory object) {
				return createUserStoryAdapter();
			}
			@Override
			public Adapter caseAcceptanceTest(AcceptanceTest object) {
				return createAcceptanceTestAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseEpic(Epic object) {
				return createEpicAdapter();
			}
			@Override
			public Adapter caseWho(Who object) {
				return createWhoAdapter();
			}
			@Override
			public Adapter caseWhat(What object) {
				return createWhatAdapter();
			}
			@Override
			public Adapter caseWhy(Why object) {
				return createWhyAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseProductBacklogHeader(ProductBacklogHeader object) {
				return createProductBacklogHeaderAdapter();
			}
			@Override
			public Adapter caseBacklogItem(BacklogItem object) {
				return createBacklogItemAdapter();
			}
			@Override
			public Adapter caseProductBacklogContent(ProductBacklogContent object) {
				return createProductBacklogContentAdapter();
			}
			@Override
			public Adapter caseProductBacklog(ProductBacklog object) {
				return createProductBacklogAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link us.Theme <em>Theme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.Theme
	 * @generated
	 */
	public Adapter createThemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.UserStory
	 * @generated
	 */
	public Adapter createUserStoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.AcceptanceTest <em>Acceptance Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.AcceptanceTest
	 * @generated
	 */
	public Adapter createAcceptanceTestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.Epic <em>Epic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.Epic
	 * @generated
	 */
	public Adapter createEpicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.Who <em>Who</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.Who
	 * @generated
	 */
	public Adapter createWhoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.What <em>What</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.What
	 * @generated
	 */
	public Adapter createWhatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.Why <em>Why</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.Why
	 * @generated
	 */
	public Adapter createWhyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.ProductBacklogHeader <em>Product Backlog Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.ProductBacklogHeader
	 * @generated
	 */
	public Adapter createProductBacklogHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.BacklogItem <em>Backlog Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.BacklogItem
	 * @generated
	 */
	public Adapter createBacklogItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.ProductBacklogContent <em>Product Backlog Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.ProductBacklogContent
	 * @generated
	 */
	public Adapter createProductBacklogContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link us.ProductBacklog <em>Product Backlog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see us.ProductBacklog
	 * @generated
	 */
	public Adapter createProductBacklogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UsAdapterFactory
