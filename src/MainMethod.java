
public class MainMethod {

	public static void main(String[] args) {

			int a,b,c,d, answerInt;
			double x,y,z, answerDouble;
			// 1) WAP to find sum of two numbers
			a=10;
			b=20;
			sumOfTwo mysumOfTwo = new sumOfTwo();
			answerInt = mysumOfTwo.sumOfTwoNumbers(a, b);
			System.out.println("The sum of "+a+" and "+ b + " is: "+answerInt);
			answerInt = 0;
			
			// 2) WAP to find the average of three integer numbers
			a=10;
			b=20;
			c=25;
			averageOfThree myaverageOfThree = new averageOfThree();
			answerDouble = myaverageOfThree.averageOfThreeIntegers(a,b,c);
			System.out.println("The average of "+ a +" , "+ b + " and "+ c + " is: "+answerDouble);
			answerDouble = 0;
			
			// 3) area of a circle
			x=15.5;
			areaCircle myArea = new areaCircle();
			answerDouble = myArea.areaOfCircle(x);
			System.out.println("The area of a circle with radius "+ x +" = "+ answerDouble);
			answerDouble = 0;

			// 4) WAP to find circumference of a circle
			x=15.5;
			circumCircle mycircumCircle = new circumCircle();
			answerDouble = mycircumCircle.circumOfCircle(x);
			System.out.println("The circumference of a circle with radius "+ x +" = "+ answerDouble);
			answerDouble = 0;
			
			// input is marksAttained by the student out of totalMarks
			x=438.0;
			y=500.0;
			percent mypercent = new percent();
			answerDouble = mypercent.percentOfStudent(x,y);
			System.out.println("The percent for a student with marks attained "+ x +" out of "+ y + " is: " + answerDouble);
			answerDouble = 0;

			// 7) WAP to find the sum of four numbers
			a=10;
			b=20;
			c=25;
			d=44;
			sumOfFour mysumOfFour = new sumOfFour();
			answerInt = mysumOfFour.sumOfFourNumbers(a,b,c,d);
			System.out.println("The sum of "+ a +" , "+ b + " , "+ c + " and "+ d + " is: "+answerInt);
			answerDouble = 0;

			// 8) WAP to calculate the discount price
			x=250.0; //price
			y=2.5;   // discount percent
			discountedPrice mydiscountedPrice = new discountedPrice();
			answerDouble = mydiscountedPrice.discountPrice(x,y);
			System.out.println("The discount price for "+ x +" with "+ y + " % discount applied is: $" + answerDouble);
			answerDouble = 0;
			
			//9)
			x=250.0; //price
			y=2.5; // tax percent		
			serviceTax myserviceTax = new serviceTax();
			myserviceTax.calculateServiceTax(x, y);
			
			// 10) WAP to print On-road price of the car, where it has 18.5% of road tax and 12.9% insurance of
			//ex-showroom price of the car
			x=22750.0; // showroom price

			onRoadPrice myonRoadPrice = new onRoadPrice();
			answerDouble = myonRoadPrice.CalculateOnRoadPrice(x);
			System.out.println("The On-Road price for "+ x +" with 18.5% tax and 12.9% insurance applied is: $" + answerDouble);
			answerDouble = 0;	
			
			// 11) WAP to swap two numbers using temporary variable
			a=25;
			b=33;
			swapTwoUsingTemp myswapTwoUsingTemp = new swapTwoUsingTemp();
			myswapTwoUsingTemp.swapTwoNumbersUsingTemp(a, b);
			
			// 12) WAP to swap two numbers without using temporary variable
			a=25;
			b=100;
			swapTwoWOTemp myswapTwoWOTemp = new swapTwoWOTemp();
			myswapTwoWOTemp.swapTwoNumbers(a,b);
			
			// 13) WAP to print if the number is odd or even
			a=33;
			oddOrEven myoddOrEven = new oddOrEven();
			myoddOrEven.evenOrOdd(a);
			
			//	14) WAP find the largest of three numbers
			a=45;
			b=50;
			c=50;
			largestInThree mylargestInThree = new largestInThree();
			mylargestInThree.largestOfThree(a,b,c);
			
//			15) WAP to find if the given number is divisible by both 4 and 7
			a=28;
			divisibleBothBy4and7 mydivisibleBothBy4and7 = new divisibleBothBy4and7();
			mydivisibleBothBy4and7.divisibleByFourAndSeven(a);
			
//			16) WAP to print the grade of the student, with respect to scored percentage
			x=25;
			gradeForPercentage mygradeForPercentage = new gradeForPercentage();
			mygradeForPercentage.grade(x);	
			
			//	17) WAP to print BMI result of a person for the calculated BMI value
			BMI myBMI = new BMI();
			myBMI.calculateBMI(1.67,50.0);
			
			//	18) WAP to print the numbers from 1 to 10
			print1To10 myprint1To10 = new print1To10();
			myprint1To10.printTen();
			
			//	19) WAP to print the numbers from 10 to 1
			print10To1 myprint10To1 = new print10To1();
			myprint10To1.printTenReverse();
			
			//	20) WAP to print if the number is odd or even from 1 to 10
			printEvenOrOddTen myprintEvenOrOddTen = new printEvenOrOddTen();
			myprintEvenOrOddTen.printTenEvenOrOdd();
			
			//	21) WAP to print the numbers from 1 to 200, who are divisible by both 3 and 5
			divisibleBy3and5 mydivisibleBy3and5 = new divisibleBy3and5();
			mydivisibleBy3and5.printTwoHundred();
			
			//	22) WAP to print only odd numbers from 1 to 100, which are divisible by 7 and is odd
			oddDivisibleBy7 myoddDivisibleBy7 = new oddDivisibleBy7();
			myoddDivisibleBy7.printOneHundred();
			
			//	23) WAP to print if the given number is prime or not
			a = 4;
			primeOrNot myprimeOrNot = new primeOrNot();
			myprimeOrNot.ifPrime(a);
			
			//	24) WAP to print the prime numbers in the given range
			a=0;
			b=20;
			primeInRange myprimeInRange = new primeInRange();
			myprimeInRange.primeInARange(a,b);
			
			//	25) WAP to find the sum of n numbers
			int[] arrayOfNumbers = {2,4,6,8,10,12,14,16,18,20};
			sumOfN mysumOfN = new sumOfN();
			mysumOfN.sumN(arrayOfNumbers);
			
			//	26) WAP to find the product of n numbers
			int[] arrayOfNum = {2,4,6,8,10,12,14,16,18,20};
			productOfN myproductOfN = new productOfN();
			myproductOfN.productN(arrayOfNum);
			
			//	27) WAP to find the factorial of given number
			a=5;
			factorials myfactorials = new factorials();
			myfactorials.factorial(a);
			
			//	28) WAP to find the fibonacci series of given number
			 fibonacciSeq myfibonacciSeq = new fibonacciSeq();
			 myfibonacciSeq.fibonacci(10);
						
			//	29) WAP to reverse the given number
			a=214;
			reverseTheNumber myreverseTheNumber = new reverseTheNumber();
			myreverseTheNumber.reverseDigits(a);
			
			
			//	30) WAP to count number of digits present in the given number
			a=25487;
			countDigitsInNumber mycountDigitsInNumber = new countDigitsInNumber();
			mycountDigitsInNumber.countDigits(a);

		}


}
