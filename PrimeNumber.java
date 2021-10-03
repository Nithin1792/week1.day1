package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =13;
		// num should be divided by either 1 or itself giving reminder zero
		for (int i = 1; i < num; i++) {
			// cannot divide by zero so starting with 1
			if(num%i==0)
				System.out.println("The number is prime");
			
		}
		 
	}

}
