import java.util.*;

public class Problem1309 {

	public static String freqAlphabets(String s) {
		int i = 0, j = i+2, temp = 0;
		StringBuilder sb = new StringBuilder();
        while(j < s.length()) {
            if(s.charAt(j) != '#') {
                temp = Character.getNumericValue(s.charAt(i)) + 96;
                i++;
                j++;
            }
            else {
                temp = Integer.parseInt(s.substring(i,i+2)) + 96;
                i = i+3;
                j = j+3;
            }
            char c = (char) temp;
            sb.append(Character.toString(c));
        }
        while(i < s.length()) {
            temp = Character.getNumericValue(s.charAt(i)) + 96;
            char c = (char) temp;
            sb.append(Character.toString(c));
            i++;
        }
        return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(freqAlphabets("10#11#12"));
	}
}
