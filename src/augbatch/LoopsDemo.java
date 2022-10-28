package augbatch;

public class LoopsDemo {
	public static void main(String[] args) {
		
		//  3 types 
//		while - condition check then execution , min = 0
//		do while - first executionn then condition, min = 1
//		for -  how many times 

//		int i = 20;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
		
//		int m = 1;
//		do {
//			System.out.println(m);
//			m++;
//		}while(m <= 10);
		
		
		for(int k = 0, m = 1; k < 10 && m < 10 ; k++,m++) {
			System.out.println(k + " - " + m);
		}
		
	}
}
