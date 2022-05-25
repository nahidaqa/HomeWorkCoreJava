package hw5Q2Constructor;

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
