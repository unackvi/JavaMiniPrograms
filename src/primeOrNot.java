
public class primeOrNot {
	//	23) WAP to print if the given number is prime or not
	public void ifPrime(int x) {
		boolean isThisPrime = true;
		// 0 and 1 are not prime
		if (x == 0 || x== 1) {
			System.out.println("The number "+x+" is not Prime");
			return;
		} else if (x==2) {
			// 2 in the only prime that is even
			System.out.println("The number "+x+" is Prime");
			return;
		}
		// no composite number is divisible by more than half of itself so loop through from 3-x
		// break if x%loopCounter == 0 (divisible by that number)
		for (int i=2; i<=x/2; i++) {
			if (x%i == 0) {
				isThisPrime = false;
				break;
			}
		}
		if (isThisPrime==true) {
				System.out.println("The number "+x+" is Prime");
		}else {
			System.out.println("The number "+x+" is not Prime");
		}
	}
}
