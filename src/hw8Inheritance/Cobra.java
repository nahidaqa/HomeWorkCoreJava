package hw8Inheritance;

//Here Cobra is a Child class, and Snake is a Parent class
//Cobra -- snake--reptile--Animal
//Single inheritance: Cobra extends Snake
//Multilevel inheritance: Cobra extends Snake, Snake extends Reptile and Reptile extends Animal.
//Hierarchical Inheritance: Reptile extends Animal

public class Cobra extends Snake {
	public void cobraInfo() {
		System.out.println("This method is from Cobra Class");

	}

}
