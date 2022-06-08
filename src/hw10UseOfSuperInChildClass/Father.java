package hw10UseOfSuperInChildClass;

public class Father {
//declare 5 Global variable
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;
	
	//Declare default constructor
	public Father() {
		System.out.println("This is default constructor from Father class");
	}
	// Parameterized constructor -Local Variable
	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name= name;
		this.age=age;
		this.sex=sex;
		this.usCitizen=usCitizen;
		System.out.println("This is parameterized constructor from Father class");
		System.out.println("Name: "  + name + " Age:  "  + age + " Sex:  "  + sex + " USCitizen: " + usCitizen);
	}
	// Regular void type method
	public void father() {
		System.out.println("This is void type method from Father class");
	}
	// This is parameterized method
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		this.name= name;
		this.age = age; 
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("This is parameterized method from Father class");
		System.out.println("Name: " + name + " Age:  " + age + " Sex:  " + sex + " USCitizen: " + usCitizen);
	}
	
	
	
	
	 
	
	
	
}
