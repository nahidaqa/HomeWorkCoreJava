package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("---------- default constructor initialized from Daughter Class ----------");
		Daughter daughter = new Daughter();
		
		System.out.println("\n---------- parameterized constructor initialized from Daughter Class ----------");
		Daughter daughter2 = new Daughter ("November", 30);
		
		System.out.println("\n---------- void type method initialized from Daughter Class ----------");
		daughter2.daughter();
		
		System.out.println("\n---------- parameterized method initialized from Daughter Class ----------");
		daughter2.daughterInfo("November", 30);
		
		System.out.println("\n---------- default constructor initialized from Father Class ----------");
		Father father = new Father(); 
		
		System.out.println("\n---------- parameterized constructor initialized from Father Class ----------");
		Father father2 = new Father("Nahida", 30, 'F', false);
		
		System.out.println("\n---------- void type method initialized for Father Class ----------");
		father2.father();
		
		System.out.println("\n---------- parameterized method initialized for Father Class ----------");
		father2.fatherInfo("Nahida", 30, 'F', false);

		
		

	}

}
