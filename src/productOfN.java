public class productOfN {

	//	26) WAP to find the product of n numbers
	public void productN(int[] listOfInt) {
		long prod=1;
		for (int i=0;i<listOfInt.length;i++) {
			prod*=listOfInt[i];
		}
		System.out.println(" The product of this list of numbers is: "+prod);
	}

}
