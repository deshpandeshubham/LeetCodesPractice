
public class Problem521 {

	public static int findLUSlength(String a, String b) {
		if(a.equals(b))
            return -1;
        else if(a.length() == b.length())
            return a.length();
        else
            return Math.max(a.length(), b.length());
    }
	
	public static void main(String[] args) {
		System.out.println(findLUSlength("abcd", "abc"));
	}
}
