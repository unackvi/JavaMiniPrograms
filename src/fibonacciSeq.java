
public class fibonacciSeq {
	//	28) WAP to find the fibonacci series of given number
	public void fibonacci(int givenNum) {
		int sum = 0;
		int previousNum = 0;
		int currentNum = 1;
		System.out.print("The fibonacci sequence for the number "+givenNum+ " is: " );		
		for(int i=0; i<givenNum; i++) {
			if(sum == 0 || sum == 1) {
				System.out.print(sum+" ");
			}
			sum = previousNum + currentNum;
			previousNum = currentNum;
			currentNum = sum;	
			System.out.print(sum+" ");
		}
		System.out.println();
	

	}
	
	
}
