package hw3JavaVariables;

/*Create a package name "hw3JavaVariables" inside the Home work project, Create a Class name "AboutMe". Declare one type of variable(only one, so you know declare vs initialize), and initialize String and other 8 types of variable (you can try to give a different name from mine). Instantiate AboutMe class under main method and call few variables (not all) by object (you can use String concatenation to make it more meaningful outcome). Give a single line comment where a variable is declared and where initialized (Example: // Variable declared). Follow indentation by Organizing the code and paste below.
 * 
 */
public class AboutMe {

// Variable Declared : Not assign any value for variables 
	int houseNo;
//Variable Initialize: Assign value for variables. 
	String roadName = "Van Reypen Street";
//8 types of Primitive:  
	boolean greenCard = true;
	byte aptName = 5;
	short countryCode = 5001;
	char aptNo = 'J';
	int roadNo = 88;
	long nasaLong = 5557788l;
	long nahida = 31; //quiz -- why the JAVA allow me to print long without L
	float mobileNo = 5.1517477f;
	double parkNo = 2.588522;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe(); // class Instantiate
		System.out.println(aboutMe.roadNo + " " + aboutMe.roadName + " " + aboutMe.aptName + " " + " " + aboutMe.aptNo);
		System.out.println(aboutMe.nahida);//quiz

	}

}
