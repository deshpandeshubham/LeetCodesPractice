
public class Problem917 {

	public static String reverseOnlyLetters(String S) {
		 StringBuilder result = new StringBuilder();
	        int i=0, j=S.length()-1;
	        while(i < S.length()) {
	        	if(Character.isLetter(S.charAt(i))) {
	                while(!Character.isLetter(S.charAt(j)))
	                    j--;
	                result.append(S.charAt(j--));
	            }
	            else
	                result.append(S.charAt(i));
	            i++;
	        }
	        return result.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(reverseOnlyLetters("-S2,_"));
	}
}
