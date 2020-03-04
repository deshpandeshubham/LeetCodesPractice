import java.util.*;

public class Problem125 {

	public static boolean isPalindrome(String s) {
		String str = "";
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
				str += Character.toLowerCase(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder(str);
		System.out.println(str + "\n" + sb.reverse().toString());
		return str.equals(sb.reverse().toString());
    }
	
	public static void main(String[] args) {
		String s = "0P";
		isPalindrome(s);
	}
}
