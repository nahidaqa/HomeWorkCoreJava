package hw5Q2Constructor;
/*
 * Create a package name "hw5Q2Constructor" in your Home Work project. Inside the package, a) Create a class "Computer". Declare some variable -- brand, model, operating system, price, grade (grade as char) and madeInUSA. Declare default constructor and more than one parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class ComputerTest. Create object from Computer class, as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as -> This is from default Constructor of Computer class. Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in USA? Ans: false. I want the third outcome in console for your configuration.  (Assume you are a Windows user even you are not). Organize your code. Push in the github. Paste your github link below.
 */

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public double price;
	public char grade;
	public boolean madeInUsa;
		
	public Computer() {
		System.out.println("This is from default Constructor of Computer class.");
		System.out.println();
	}
	
	public Computer(String brand, String model, String operatingSystem, double price, char grade, boolean madeInUsa) {
		this.brand=brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price= price;
		this.grade = grade; 
		this.madeInUsa = madeInUsa;
		
		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperating system: " + operatingSystem
				+ "\nPrice: $" + price + "\nGrade: " + grade + "\nMade in USA: " + madeInUsa);
		System.out.println();
	}

	public Computer(double price, String model, String brand, String operatingSystem, char grade, boolean madeInUsa) {
		this.price= price; 
		this.model= model;
		this.brand =brand; 
		this.operatingSystem = operatingSystem; 
		this.grade= grade;
		this.madeInUsa=madeInUsa; 
		
		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperating system: " + operatingSystem
				+ "\nPrice: $" + price + "\nGrade: " + grade + "\nMade in USA: " + madeInUsa);

	}

}
