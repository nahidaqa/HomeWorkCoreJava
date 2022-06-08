package hw9Abstraction;

//Can you create a Constructor inside University interface?
// No, We cannot have a constructor within an interface in Java
// University(){}

/*1. how many keywords are used for the inheritance in Interface?
 	 Ans:   2 keywords: one is implements keyword and another is extends keyword.

2. Can an interface inherit other Interfaces, or a regular class or abstract class by extends key word?
 Ans: Yes: an interface can inherit other Interfaces  by extends key word . But can't inherit a regular class or abstract class by extends key word

3. How many inheritance is possible? 
 Ans: An interface can inherit one or more than one interface by using extends keyword.  
 
 */
public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();

	default void gymnasium() {

	}

	public static void library() {

	}

}
