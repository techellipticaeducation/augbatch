package augbatch;

public class MethodDemo {
public static void main(String[] args) {
	MethodDemo m1 = new MethodDemo();
	int b = m1.add(10, 20);// arguments - call method
	System.out.println(b);
}
	// service - 

// Method - like a behaviour of a class , 
// which injest some argument and return 
// some output based on logic implimented

// input - parameters
	// output - return type	
    // last logical statement
	//param  - define
	int add(int i , int j){
	if(i == 10) {
		return 10;
	}
		return i +j;
	}
	
	double valueOfPi(){
		return 3.14d; 
	}
	
	void noreturn(int a){
		return;
	}
	
}
