package hw4JavaVariables;

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
