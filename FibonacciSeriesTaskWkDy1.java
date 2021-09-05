package week1.day1;

public class FibonacciSeriesTaskWkDy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range=8;
		int firstNum = 0;
		int secondNum = 1;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for (int i = 1; i <=8; i++) {
			int sum= firstNum + secondNum;
			System.out.println(sum);
			firstNum=secondNum;
			secondNum=sum;
		}
			
			
		}

	}


