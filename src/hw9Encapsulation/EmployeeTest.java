package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Nahida Islam");
		employee.setAge(30);
		employee.setSex('F');
		employee.setUsCitizen(false);
		System.out.println("Employee Name: " + employee.getName() + "\nEmployee Age: " + employee.getAge()
				+ "\nEmployee Sex:" + employee.getSex() + "\nEmployee USCitizen:" + employee.isUsCitizen());

	}

}
