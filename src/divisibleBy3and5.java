
public class divisibleBy3and5 {
	//	21) WAP to print the numbers from 1 to 200, who are divisible by both 3 and 5
	public void printTwoHundred() {
		System.out.print("The numbers both divisible by 3 and 5: ");
		for (int i=1;i<=200;i++) {
			if (i%3 == 0 && i%5 == 0) {
				System.out.print(i+" ");
			} 
		}
		System.out.println();
	}
	
}
