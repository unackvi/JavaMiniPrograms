
public class oddDivisibleBy7 {
	//	22) WAP to print only odd numbers from 1 to 100, which are divisible by 7
	public void printOneHundred() {
		System.out.print("The numbers that are both divisible by 7 and odd are: ");
		for (int i=1;i<=100;i++) {
			if (i%7 == 0 && i%2 != 0) {
				System.out.print(i+" ");
			} 
		}
		System.out.println();
	}	
	
}
