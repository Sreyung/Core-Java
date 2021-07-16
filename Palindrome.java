package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "madamr"; 
        String rev;
        char ch[] = s.toCharArray();
        for (int i = ch.length-1; i < ch.length; i--) {
		  
		   
			   rev = String.valueOf(ch);
			   System.out.println(rev);
		}
        
		  /* for (int i = s.length()-1; i < s.length(); i--) {
				
			   
			   
		
		}*/
		}
	}


