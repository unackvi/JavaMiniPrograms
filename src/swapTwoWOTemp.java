
public class swapTwoWOTemp {
	// 12) WAP to swap two numbers without using temporary variable
	public void swapTwoNumbers(int x, int y) {
		x=x+y;
		y=x-y;
		x=x-y;

		System.out.println("Value of first number = " + x + " Value of second number = " + y);
	}	
	
}
