package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S = "sreyung";
		char ch[] = S.toCharArray();
		for (int i = 0; i < ch.length; i++) {	
		if (i%2 != 0) {
			System.out.println(Character.toUpperCase(ch[i]));
		}
		else {
			System.out.println(ch[i]);
		}
			
		}

	}

}
