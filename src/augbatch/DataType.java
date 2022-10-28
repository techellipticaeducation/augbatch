package augbatch;

public class DataType {
public static void main(String[] args) {
	int i = 10;
	System.out.println(i<11?"part1":"part2");
	i+=2;
	System.out.println(i<11?"part1":"part2");
	
	
	
//	pi = 3.14

//	5+9 = 14
//  lincon + 9  =
//  abstract class / interface
//	DataType = Data + Type
	/*
	 *  octal and hexadecimal
	 *  
	 *  Numerical DataType , 1,2,3 ,410,100
	 *  byte - 1 byte - 8 bit , 2^8 = 256
	 *  short - 2 byte - 16 bit , 2^16 = 65
	 *  int  - 4 byte - 32 bit , 2^32 
	 *  long - 8 byte - 64 bit , 2^64
	 *  
	 *  Floating DataType , 1.45, 4.32
	 *  float - 4 byte
	 *  double - 8 byte
	 *  
	 *  char - a
	 *  
	 *  boolean - true , false
	 *  
	 * 	What is Byte ?
	 *  memory storage unit - byte
	 *  
	 *   1 byte = 8 bit 
	 *   1 bit = 0,1 (binary)
	 *  
	 *  	(2)^8 = 256 values
	 *  
	 *  range = 0 to 255 (positive values)
	 *   256 = 128
	 *   
	 *  range =  -128 to +127
	 *   0 ....... 127 .. -128 .. -127, -126
	 * 
	 *  127 + 128 = 255 +0 = 256
	 */
	
//	byte b1 = (byte)300;
//	System.out.println(b1);
	//b1 = -129;
	// cast
	
//	int b2 = 23897329;
//	long j = 3243_2334_3322_2354l;
//	System.out.println(j);
	
	// 8 = 0,1,2,3,4,5,6,7
	// 10 = 0,1,2,3,4,5,6,7,8,9 = 
	// 16 = 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
	
//	int k = 34;
//	System.out.println(k);
//	int k1 = 03624;  // octal value
//	System.out.println(k1);
//	int k2 = 0X34E; // Hexadecimal value
//	System.out.println(k2);
	
	
	
	// Floating 
	float g = 13.4f;
	double f = 34.2d;
	
	char h = 'k';
	int kl = (int)h;
	System.out.println(kl);
	
	int p = 107;
	char gh = (char)p;
	System.out.println(gh);
	// all char is int, but all int is not char
	
	char j = 'A' + 'B';
	System.out.println(j);
	
	
	// boolean 
	boolean hj = true;
	boolean k = false;
	
	
	
}
}
