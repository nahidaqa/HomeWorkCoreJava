package hw10Abstraction;

/* 1. How many keywords are used for the inheritance in Java for a regular Class
 * Ans: 2 keywords: extends and implements keywords are used for the inheritance in Java for regular Class.
 * 
 * 2. Can a regular Class inherit other Abstract Class or a regular class or interface by extends key word or implements keyword
 * Ans: For regular class or a Abstract class: YES: can inherit by extends keyword
 * 			For interface class: For interface inherit by implements keyword. 
 * 
 * 3. How many inheritances is possible by a regular Class
 * Ans: A regular class can inherit 1 or more than 1 interface class by implements keyword. 
 * 
 * 
 */

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	// Yes, we can create a Constructor inside a regular Class
	ColumbiaUniversity() {

	}

	// The abstract method chemistry not allowed in regular class
	// public abstract void chemistry();

	public void biology() {
		System.out.println("I like to read biology");
	}

	@Override
	public void anatomyLab() {// From Medical School
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() { // From Nursing School
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub

	}

	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void classSize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub

	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub

	}

}
