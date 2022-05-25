package hw5Q3Constructor;

public class Student {
	
	public String studentname;
	public int studentID; 
	public char sex;  
	public boolean isProgrammer; 
	public float grade; 
	
	public Student(){
		System.out.println("This is from default Constructor of Student class");
		System.out.println();
  }
	public Student(String studentname, int studentID, char sex,  boolean isProgrammer, float grade) {
		this.studentname = studentname;
		this.studentID = studentID;
		this.sex = sex;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " +studentname + "\nID: "+ studentID+ "\nSex: " + sex+ "\nGrade: " + grade+ "\nJava Programmer: " + isProgrammer);
	} 
	


}