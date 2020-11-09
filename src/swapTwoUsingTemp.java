
public class swapTwoUsingTemp {
	// 11) WAP to swap two numbers using temporary variable
	public void swapTwoNumbersUsingTemp(int x, int y) {
		int temp;
		temp = x;
		x=y;
		y=temp;
		System.out.println("Value of first number = " + x + " Value of second number = " + y);
	}
}
