/**
 */
package us;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Backlog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link us.ProductBacklog#getContent <em>Content</em>}</li>
 *   <li>{@link us.ProductBacklog#getHeader <em>Header</em>}</li>
 * </ul>
 *
 * @see us.UsPackage#getProductBacklog()
 * @model
 * @generated
 */
public interface ProductBacklog extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(ProductBacklogContent)
	 * @see us.UsPackage#getProductBacklog_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProductBacklogContent getContent();

	/**
	 * Sets the value of the '{@link us.ProductBacklog#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ProductBacklogContent value);

	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(ProductBacklogHeader)
	 * @see us.UsPackage#getProductBacklog_Header()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProductBacklogHeader getHeader();

	/**
	 * Sets the value of the '{@link us.ProductBacklog#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(ProductBacklogHeader value);

} // ProductBacklog
