package week1.day1;

public class factorialTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 5;
		int fact = 1;
		
		for (int i = 1; i <= input; i++) {
			fact = fact * i;
			
		}
		System.out.println("Factorial of 5 is " + fact);
		
	}
	
	
}
