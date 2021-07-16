package week1.day1;

public class Amstrongnumber {

	public static void main(String[] args) {
		int n = 123;

		/*
		 * System.out.println(n%10); System.out.println(n/10);
		 */
		
	
		int rem = 0;
		int quo = 0;
		//Assigning quotient = n --> 153
		quo = n;
		int sum = 0;
		while (quo != 0) {
			// when 1st iteration is finished, we should check the remaining quotient so use quo%100
			rem = quo % 10;
			quo = quo / 10;
			int a = rem * rem * rem;
			sum = sum + a;

		}

		if (sum == n) {
			System.out.println(n + "is an amstrong number");

		} else {
			System.out.println(n + " is not an amstrong number");

		}
	}
}
