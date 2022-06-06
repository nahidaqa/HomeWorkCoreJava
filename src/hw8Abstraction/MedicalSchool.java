package hw8Abstraction;

public abstract class MedicalSchool {
	// Can you create a Constructor inside MedicalSchool Abstract Class?
	MedicalSchool() { // Yes, an Abstract Class can have a Constructor.

	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is non abstract or implemented method-MedicalSchool ");

	}

}
