package hw10Abstraction;

/*1.    How many keywords are used for the inheritance in Java for Abstract Class?
 * Ans: 2 keywords: extends and implements keywords are used for the inheritance in Java for Abstract Class.
 * 
 * 2.  Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends keyword
 * Ans: Yes, an Abstract class can inherit only 1 Abstract class by extends keyword.
 *         Yes, an Abstract class can inherit only 1 regular class by extends keyword.
 *         No, an Abstract class can't inherit an interface by extends keyword. 
 * 
 * * 3. How many inheritances is possible by an Abstract Class?
 * Ans: an Abstract class can inherit one or more interface class by implements keywords. 
 */

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	// Can you create a Constructor inside MedicalSchool Abstract Class?
	MedicalSchool() { // Yes, an Abstract Class can have a Constructor.

	}

	public abstract void anatomyLab();

	public void biochemistryLab() {
		System.out.println("This is non abstract or implemented method-MedicalSchool ");

	}

}
