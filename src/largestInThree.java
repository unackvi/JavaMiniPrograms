
public class largestInThree {
	//	14) WAP find the largest of three numbers
	public void largestOfThree(int x, int y, int z) {
		int largest;
		largest = 0;
		if (x>=y && x>=z) {
			largest = x;
		} else if (y>=x && y>=z) {
			largest = y;
		} else {
			largest = z;
		}
			
//		if (x>y) {
//			if(x>z) {
//				// x is larger than y and z
//				largest = x;
//			} else  {
//				//x>y and x<z so z is larger than x which is larger than y
//				largest = z;
//			}
//		} else {
			// x<y or y>x
//			if(y>z) {
//				// y is larger than x and z
//				largest=y;
//			} else {
				//x>y and y<z
//				largest = z;
//			}
//				
//		}
		System.out.println("The largest number out of "+x+","+y+","+z+" is: " +largest);
	}
}
