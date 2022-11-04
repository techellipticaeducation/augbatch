package augbatch;

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name ="sabbir";
		s1.className = "Masters";
		
		Student.planet ="Earth";


		Student s2 = new Student();
		s2.name = "Lincoln";
		s2.className = "Masters";
		Student.planet ="Mars";

		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(Student.planet);
		
		Student.m1();
		// What is instance variable
		// Object = instance 

		// shared variable - static variable
		
		// to call static methods, variables,
		// we dont need to create any Object
	}

}

class Student{

	// characteristics
	String name;
	int age;
	double weight;
	String className;

	static String planet ;   // Shared variable
	// Class Variable


	//instance -  inside class but outside method
	
	// 
	
	// Behaviour
	void speak(String content){
		System.out.println(name + " : " + content);
	}
	static void m1() {
		System.out.println("m1 method");
	}

}

