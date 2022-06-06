package hw8Inheritance;

// Here BullDog is a Child class, and Dog is a Parent class
// bulldog -- dog -- mammal --Animal
// Single inheritance: BullDog extends Dog
// Multilevel inheritance: Bulldog extends Dog, Dog extends Mammal and Mammal extends Animal.
// Hierarchical Inheritance: Mammal extends Animal

public class BullDog extends Dog {
	public void bullDogInfo() {
		System.out.println("This method is from BullDog Class");

	}

}
