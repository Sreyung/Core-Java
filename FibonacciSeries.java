package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assign second number to the first number

				// Assign first number to the sum
				// Assign sum to the second number

				// print sum
		
		/*int first = 0;
		int second = 1;
		int i;
		
		int temp = 0;
		
		
		second = first;
		first = temp;
		
		temp = second;
int sum = temp + second;
		
		System.out.println(sum);*/
int a=0;
int b=1;
int c=12;
int n = 0;
		for(int i=2; i<=c; i++) {
			 n = a+b;
			a=b;
			b=n;
			  
		}
		System.out.println(n);
		System.out.println(b);
	}

}
