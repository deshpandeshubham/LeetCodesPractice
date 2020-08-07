
public class Problem1071 {

	public static String gcdOfStrings(String str1, String str2) {
		if (str1.length() < str2.length()) 
			return gcdOfStrings(str2, str1);
		if (str2.length() == 0) 
			return str1;
		if (str1.startsWith(str2)) {
			str1 = str1.substring(str2.length());
			return gcdOfStrings(str1, str2);
		}
		return "";
    }
	
	public static void main(String[] args) {
		System.out.println(gcdOfStrings("ABCABC", "ABCABD"));	
	}
}
