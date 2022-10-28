package augbatch;

public class ConditionalStatementDemo {
	public static void main(String[] args) {
		int age = 35;
		String ageGroup = "";
		//	String ageGroup = age<=18 ? "child" : "Adult" ;
		//	System.out.println(ageGroup);

		// age <= 18 = child
		// age > 18 and age <=30 = adult
		// age > 30 and age <=45 = mature
		// age > 45 and age <=60 = old
		// age >  60 = SS

		if(age <= 18) {
			ageGroup = "Child";
		}else if(age > 18 && age <=40) {
			ageGroup = "Adult";
		}else if(age > 30 && age <=45) {
			ageGroup = "Mature";
		}else if(age > 45 && age <=60) {
			ageGroup = "Old";
		}else {
			ageGroup = "SS";
		}
		System.out.println(ageGroup);
	}
}
