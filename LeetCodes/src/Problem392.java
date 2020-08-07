
public class Problem392 {

	public static boolean isSubsequence(String s, String t) {
        for(int i=0;i<s.length();) {
        	for(int j=0;j<t.length();) {
        		if(s.charAt(i) == t.charAt(j)) {
        			i++;
        			j++;
        		}
        		else {
        			if(j == t.length() - 1)
        				return false;
        			j++;
        		}
        	}
        }
		return true;
    }
	
	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "ahbgdc"));
	}
}
