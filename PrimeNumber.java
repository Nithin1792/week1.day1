package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		for (int i = 1; i <=13; i++) {
			
			if(num%i==0)
				System.out.println("The number is not prime");
			else
				System.out.println("The number is prime");
			
		}
		 
	}

}
