
public class factorials {
	//	27) WAP to find the factorial of given number
	public void factorial(int x) {
		int answer = 1;
		int savedInput = x;
		while (x>0) {
			answer = answer*x;
			x--;
		}
		System.out.println("The factorial of "+savedInput+" is "+ answer);
	}	
	
}
