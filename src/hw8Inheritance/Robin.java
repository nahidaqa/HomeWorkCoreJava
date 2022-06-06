package hw8Inheritance;

//Here Robin is a Child class, and Birds is a Parent class
//Robin -- Bird -- Animal 
//Single inheritance: Robin extends Birds
//Multilevel inheritance: Robin extends Bird, Bird extends Animal
//Hierarchical Inheritance: Bird extends Animal

public class Robin extends Birds {
	public void robinInfo() {
		System.out.println("This method is from Robin Class");
	}

}
