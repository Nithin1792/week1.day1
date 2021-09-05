package week1.day1;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -50;
		if (num<0) {
			System.out.println("The number is negative");
			num=num*(-1);
			System.out.println("The Negative number is converted to Positive:"+num);
		}
	}

}
