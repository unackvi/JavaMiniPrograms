
public class reverseTheNumber {
	//	29) WAP to reverse the given number
	public void reverseDigits(int x) {
		int reversed = 0;
		int savedInput = x;
		while (x>0) {
			// start reversed from ones place 0*10, each time multiply it by 10 to increase the number by 10 e.g. going from 5 to 50 to 500
			//
			reversed = reversed*10 + x%10;
			x = x/10;
		}
		System.out.println("The number "+savedInput+" reversed is "+ reversed);
	}	
	
}
