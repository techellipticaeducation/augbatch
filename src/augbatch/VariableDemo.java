package augbatch;

public class VariableDemo {
public static void main(String[] args) {
	// Keyword - predefined logic written
	// #all keywords are smallcase
	// variable can't have keyword name
	
//	Variable = vary + able
//	int a = 10;
//	System.out.println(a);
//	a = 20;
//	System.out.println(a);
//	
//	int b = a;
//	System.out.println(b);
	
	int Public = 10;
	
//	public 
//	Public
	
	// Swapping the values
	int x = 10;
	int y = 7;
	
	// output = x = 7 , y = 10
	// third variable 
//	int z = x; // x = 10, y = 7, z = 10
//	x = y; // x = 7, y = 7, z = 10
//	y = z; // x = 7, y = 10, z = 10

	// without using 3rd variable
	x = x + y ;  // x = 17, y = 7
	y = x - y ; // x = 17, y = 10;
	x = x - y ; // x = 7, y = 10
	
	x = x * y ;  // x = 70, y = 7
	y = x / y ; // x = 70, y = 10;
	x = x / y ; // x = 7, y = 10
	
	// Sysout println
	
	System.out.println("Hello");

	String h1 = "hello";
	System.out.println(h1);
	h1 = h1 + " lincon bhai";
	System.out.println(h1);
	
	// + = adding
	// if we have write string , then it become append
	System.out.println("sum="+x+y);	
	System.out.println(x+y+"sum="+(x+y));	



	
	
	
	/*[a-zA-Z_$]
	 * 
	 *  int abc = 10; 	valid   
	 *  int 1abc = 10;  invalid
	 *  int _abc = 10;	valid
	 *  int #abc = 10;  invalid
	 *  int $abc = 10; 	valid
	 *  
	 *  
	 */
	

}
}
