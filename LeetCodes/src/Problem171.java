
public class Problem171 {

	public static int titleToNumber(String s) {
		int len= s.length()-1;
        int res=0;
        for(int i=0;i<s.length();i++) {
            res+=Math.pow(26,len-i)*(s.charAt(i)-64);
        }
        return res;
    }
	
	public static void main(String[] args) {
		String s = "AB";
		titleToNumber(s);
	}
}
