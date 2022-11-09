package augbatch;

public class CallByRefDemo {
 // call by value - clone , // data type
 // call by ref - actual ref // object	
	
	public static void main(String[] args) {
//		int i = 40;
//		int j = 50;
//		System.out.println("Before call");
//		System.out.println(" i " + i);
//		System.out.println(" j " + j);
//		CallByRefDemo.testme(i,j); // i = 40, j = 50
//		System.out.println("After call");
//		System.out.println(" i " + i);
//		System.out.println(" j " + j);
int l  = 10;

Integer k = l;
//String
		NewStudent st1 = new NewStudent();
		st1.name="Asif";
		System.out.println("Before call");
		System.out.println(" name " + st1.name);
		CallByRefDemo.testme1(st1);
		System.out.println("After call");
		System.out.println(" name " + st1.name);
		
	}
	
	public static void testme(int i , int j) {
		i = 10;
		j  = 20;
	}
	public static void testme1(NewStudent student) {
		student.name = "updated";
	}
}
class NewStudent{
	String name;
}

