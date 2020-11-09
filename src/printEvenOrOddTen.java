
public class printEvenOrOddTen {
	//	20) WAP to print if the number is odd or even from 1 to 10
	public void printTenEvenOrOdd() {
		for (int i=1;i<=10;i++) {
			if (i%2 == 0) {
				System.out.println("The number "+i+ " is even.");
			} else {
				System.out.println("The number "+i+ " is odd");			
			}
		}
	}
}
