/**
 */
package FishManagement.impl;

import FishManagement.FishManagementFactory;
import FishManagement.FishManagementPackage;
import FishManagement.GreenFish;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FishManagementPackageImpl extends EPackageImpl implements FishManagementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greenFishEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see FishManagement.FishManagementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FishManagementPackageImpl() {
		super(eNS_URI, FishManagementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FishManagementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FishManagementPackage init() {
		if (isInited) return (FishManagementPackage)EPackage.Registry.INSTANCE.getEPackage(FishManagementPackage.eNS_URI);

		// Obtain or create and register package
		FishManagementPackageImpl theFishManagementPackage = (FishManagementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FishManagementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FishManagementPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFishManagementPackage.createPackageContents();

		// Initialize created meta-data
		theFishManagementPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFishManagementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FishManagementPackage.eNS_URI, theFishManagementPackage);
		return theFishManagementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreenFish() {
		return greenFishEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGreenFish_Name() {
		return (EAttribute)greenFishEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGreenFish_Color() {
		return (EAttribute)greenFishEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FishManagementFactory getFishManagementFactory() {
		return (FishManagementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		greenFishEClass = createEClass(GREEN_FISH);
		createEAttribute(greenFishEClass, GREEN_FISH__NAME);
		createEAttribute(greenFishEClass, GREEN_FISH__COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(greenFishEClass, GreenFish.class, "GreenFish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGreenFish_Name(), ecorePackage.getEString(), "Name", null, 0, 1, GreenFish.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGreenFish_Color(), ecorePackage.getEInt(), "Color", null, 0, 1, GreenFish.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FishManagementPackageImpl
