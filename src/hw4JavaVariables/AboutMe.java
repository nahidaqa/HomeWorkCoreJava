package hw4JavaVariables;
/*
 * Create a package name "hw4JavaVariables" inside the HW project. Create a Class name "AboutMe". Declare String and other 8 types of variable. Create a constructor and Give a sysout inside Constructor which will print "This is all about us: ". Then Create a method name aboutMe. Inside the method -use String and other 8 types of variables inside sysout to define a person's meaningful info. Create another class AboutMeTest. Instantiate AboutMe class under main method. Initialize variables and call the method by object. I expect print outcome for 2 person, one for you and another for your best friend Alex. give a single line comment where a variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized. Follow indentation by Organizing the code and paste below. [Mark distribution (125) : using variable --10, Create a method and constructor - 20, instantiate class - 10, initialize variables and call methods for you and Alex= 20,  variable is declared and initialized, constructor is declared and initialized, method is implemented and initialized -- 15, organize code and other-- 30]. push your code to github -- 20. share the package link below.
 */

public class AboutMe {
	// variable declared

	public String name;
	public byte age;
	public short home;
	public int salary;
	public long myBankBalance;
	public float myHeight;
	public double myWeight;
	public char mySex;
	public boolean myStatus;

	// Constructor Declared:
	public AboutMe() {
		System.out.print("\nThis is All about us --- \n");
	}

	// Method implemented:
	public void aboutMe() {
		System.out.println("My Name: " + name + "\nMy age: " + age + "\nMy home: " + home + "\nMy Salary: " + salary
				+ "\nMy bank balance: " + myBankBalance + "\nMy height: " + myHeight + "\nMy weight: " + myWeight
				+ "\nMy sex: " + mySex + "\nMy status: " + myStatus);

	}

}
