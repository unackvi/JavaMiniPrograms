
public class primeInRange {
	//	24) WAP to print the prime numbers in the given range
	public void primeInARange(int x, int y) {
		boolean isThisPrime = true;
		System.out.println("The prime numbers in the range are: ");	
		
		// no composite number is divisible by more than half of itself so loop through from 3-x
		// break if x%loopCounter == 0 (divisible by that number)
		while (x<y) {
			// 0 and 1 are not prime
			if (x == 0 || x== 1) {
				x++;
				continue;
			}
			if (x==2) {
				// 2 in the only prime that is even
				System.out.print(x+ " ");
				x++;
				isThisPrime=true;
				continue;
			}
		
			for (int i=2; i<=x/2; i++) {
				if (x%i == 0) {
					isThisPrime = false;
					break;
				}
			}
			if (isThisPrime==true) {
					System.out.print(x+" ");
			}
			x++;
			isThisPrime=true;
		}
		System.out.println();
	}
}
