
public class Problem1370 {

	public static String sortString(String s) {
		StringBuffer sb = new StringBuffer();
		char min = s.charAt(0);
		for(int i=0;i<s.length();i++) {
			min = (char) Math.min(min, s.charAt(i));
		}
		System.out.println(min);
		return "";
    }
	
	public static void main(String[] args) {
		sortString("aaaabbbbcccc");
	}
}
