
public class sumOfN {
	//	25) WAP to find the sum of n numbers
	public void sumN(int[] listOfInt) {
		int sum = 0;
		for (int i=0;i<listOfInt.length;i++) {
			sum+=listOfInt[i];
			
		}
		System.out.println(" The sum of this list of numbers is: "+sum);
	}
	
}
