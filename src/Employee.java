
public class Employee {
	String name;
	int age;
	double salary;
	char gender;

	public void calculateWorkingHours() {
		System.out.println("Calculating Hours for "+name+" with salary "+salary);
	}

	public void calculateEPF() {
		System.out.println("Calculating EPF for all genders = "+gender+" and age > "+age);
	}
}
