
public class oddOrEven {
	// 13) WAP to print if the number is odd or even
	public void evenOrOdd(int x) {
		if (x==0) {
			System.out.println("The number is 0");
		}
		else if (x%2 == 0) {
			System.out.println("The number "+x+" is even");
		}else {
			System.out.println("The number"+x+" is odd");			
		}
	}
}
