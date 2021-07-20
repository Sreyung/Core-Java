package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		primeornot(7);

	}

	public static String primeornot(int number) {
		// TODO Auto-generated method stub
		int count = 0;
		int m = number / 2;
		if (number == 1 && number == 2) {
			System.out.println(number + ": is a prime number");
		} else {
			for (int j = 2; j <= m; j++) {
				if (number % j == 0) {
					System.out.println(number + ": is  not a prime number");
					count = 1;
					break;
				}

			}
			if (count == 0) {
				System.out.println(number + ": is a prime number");
			}

		}

		return "";

	}

}
