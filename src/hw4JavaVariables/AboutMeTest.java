package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		// Constructor Initialized
		AboutMe nahida = new AboutMe();
		// variable initialized
		nahida.name = "Nahida";
		nahida.age = 25;
		nahida.home = 88;
		nahida.myBankBalance = 50l;
		nahida.myHeight = 8.225f;
		nahida.mySex = 'F';
		nahida.myStatus = true;
		nahida.myWeight = 7.4444;
		nahida.salary = 35;
		// Method initialized
		nahida.aboutMe();

		// Constructor Initialized
		AboutMe alex = new AboutMe();
		// variable initialized
		alex.name = "Alex";
		alex.age = 30;
		alex.home = 85;
		alex.myBankBalance = 70l;
		alex.myHeight = 1.222f;
		alex.mySex = 'M';
		alex.myStatus = false;
		alex.myWeight = 1.88888;
		alex.salary = 45;
		// Method initialized
		alex.aboutMe();

	}

}
