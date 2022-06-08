package hw10UseOfSuperInChildClass;

//Use super method, super keyword and show all of their use in child class. 
public class Daughter extends Father {
	public String birthMonth;
	public int age;

	// Declare default constructor
	public Daughter() {
		//super(); //represents the default constructor of super/parent class
		super("Nahida", 30, 'F', false);// represents the parameterized constructor of super/parent class

		// super keyword is used to call (initialize) the methods of super (Parent) class
		super.father();
		super.fatherInfo("Noverber", 30, 'F', false);

		// super keyword is used to call (initialize) the variables of super (Parent) class

		super.name = "Nahida";
		super.age = 30;
		super.sex = 'F';
		super.usCitizen = false;
		super.familyName = "Islam";

		System.out.println("This is default Constructor from Daughter class");
	}

	// Parameterized constructor -Local Variable
	public Daughter(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This is parameterized constructor from Daughter class");
		System.out.println("BirthMonth: "  + birthMonth + " Age: "  + age);
	}

	// Regular void type non-parameterized method
	public void daughter() {
		// we can't call constructor of super class inside a method of child class.
		// super();
		System.out.println("This is regular method from Daughter class");
	}

	// This is parameterized method
	public void daughterInfo(String birthMonth, int age) {
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("This is parameterized method from Daughter class");
		System.out.println("BirthMonth: "  + birthMonth + " Age: "  + age);

	}

}
