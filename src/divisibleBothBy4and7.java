
public class divisibleBothBy4and7 {
	//	15) WAP to find if the given number is divisible by both 4 and 7
	public void divisibleByFourAndSeven(int x) {
		if (x==0) {
			System.out.println("The number is 0");
		}
		else if (x%4 == 0 && x%7 == 0) {
			System.out.println("The number "+x+" is both divisible by 4 and 7");
		} else {
			System.out.println("The number "+x+" is not divisible by 4 and 7 ");
		}
	}
	
}
