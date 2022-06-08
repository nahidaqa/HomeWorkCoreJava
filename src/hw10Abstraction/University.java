package hw10Abstraction;

/*Q: Part 01
 * Copy your previous package "hw8Abstraction" , paste and rename it to "hw9Abstraction" inside your HW project and execute the below in hw9Abstraction package. Read the question very carefully. Create one default and one static method gymnasium and library inside interface "University". Create one default and one static method morgue and pharmacy inside interface "Hospital". Create also one default and one static method dorm and studyRoom inside interface "College".
 */

/* Q: Part 02
 *  i) how many keywords are used for the inheritance in Interface, answer by Java comments?  Can an interface inherit other Interfaces, or a regular class or abstract class by extends key word? How many inheritance is possible? Use the Interface -- "University" to answer my questions (University extends College, Hospital) (by multiple line comments).  ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. how many keywords are used for the inheritance in Java for Abstract Class?  Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends keyword? How many inheritances is possible by an Abstract Class? (use java comments for the above question) Use one of above Abstract Class (MedicalSchool extends NursingSchool)  and use the keywords to answer my questions. iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. how many keywords are used for the inheritance in Java for a regular Class?  Can a regular Class inherit other Abstract Class or a regular class or interface by extends key word? How many inheritances is possible by a regular Class? (use java comments for the above question). Use one of above regular Classes (ColumbiaUniversity extends MedicalSchool ) and use the keywords to answer my questions. You don't need to execute anything as the main method is absent. no github link is necessary to paste.
 */

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
