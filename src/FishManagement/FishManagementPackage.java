/**
 */
package FishManagement;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see FishManagement.FishManagementFactory
 * @model kind="package"
 * @generated
 */
public interface FishManagementPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FishManagement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uritest";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FishManagementPackage eINSTANCE = FishManagement.impl.FishManagementPackageImpl.init();

	/**
	 * The meta object id for the '{@link FishManagement.impl.GreenFishImpl <em>Green Fish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see FishManagement.impl.GreenFishImpl
	 * @see FishManagement.impl.FishManagementPackageImpl#getGreenFish()
	 * @generated
	 */
	int GREEN_FISH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREEN_FISH__NAME = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREEN_FISH__COLOR = 1;

	/**
	 * The number of structural features of the '<em>Green Fish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREEN_FISH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Green Fish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREEN_FISH_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link FishManagement.GreenFish <em>Green Fish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Green Fish</em>'.
	 * @see FishManagement.GreenFish
	 * @generated
	 */
	EClass getGreenFish();

	/**
	 * Returns the meta object for the attribute '{@link FishManagement.GreenFish#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see FishManagement.GreenFish#getName()
	 * @see #getGreenFish()
	 * @generated
	 */
	EAttribute getGreenFish_Name();

	/**
	 * Returns the meta object for the attribute '{@link FishManagement.GreenFish#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see FishManagement.GreenFish#getColor()
	 * @see #getGreenFish()
	 * @generated
	 */
	EAttribute getGreenFish_Color();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FishManagementFactory getFishManagementFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link FishManagement.impl.GreenFishImpl <em>Green Fish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see FishManagement.impl.GreenFishImpl
		 * @see FishManagement.impl.FishManagementPackageImpl#getGreenFish()
		 * @generated
		 */
		EClass GREEN_FISH = eINSTANCE.getGreenFish();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREEN_FISH__NAME = eINSTANCE.getGreenFish_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREEN_FISH__COLOR = eINSTANCE.getGreenFish_Color();

	}

} //FishManagementPackage
