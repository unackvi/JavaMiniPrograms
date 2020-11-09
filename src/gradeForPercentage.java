
public class gradeForPercentage {
	//	16) WAP to print the grade of the student, with respect to scored percentage
	public void grade(double percent) {
		if (percent >= 90) {
			System.out.println("Your grade is A");
		}else if (percent >= 80 && percent < 90) {
			System.out.println("Your grade is B");
		}else if (percent >= 70 && percent < 80) {
			System.out.println("Your grade is C");
		}else {
			System.out.println("Your grade is F");			
		}
	}	
	
}
