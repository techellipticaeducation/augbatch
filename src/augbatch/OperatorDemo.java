package augbatch;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 12;
		int b = 8;

		//	System.out.println(a+b);
		//	System.out.println(a-b);
		//	System.out.println(a*b);
		//	System.out.println(a%b);
		//	System.out.println(a/b);
		//	System.out.println((float)a/(float)b);


		//	a = a + 1;

		//Increment operator 
		// Pre - first increase then assign ++a
		// Post - first assign then increase a++

		int x = 10;
		int y = x++ + x++ + ++x + ++x;
		//      10 + 11 + 13 + 14

		System.out.println("y="  + y);
		System.out.println("x=" + x);

		// Comparison Operator
		// return = boolean
		int m = 10;
		int n  = 9;
		System.out.println(m > n);
		System.out.println(m >= n);
		System.out.println(m < n);
		System.out.println(m <= n);
		System.out.println(m == n);
		System.out.println(m != n);

		// Assignment Operator

		m+=5; // m = m + 5 , m++ (by 1) 
		System.out.println(m);

		// Bitwise Operator

		//	&  |
		// & if both true , then true , else false
		// | any value true , then true , else false

		// true & true = true
		// true & false = false
		// false & true = false
		// false & false = false
// 
		
		// true | true = true
		// true | false = true
		// false | true = true
		// false | false = false
		
		
		boolean t = true;
		boolean f = false;

		
		int g = 10;
		int k = 9;
		System.out.println( g>15  &&  k<15); // true
 // Logical operator &&
// ||  


	}
}
