
public class Problem1370 {

	public static String sortString(String s) {
		StringBuffer sb = new StringBuffer();
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++)
			arr[s.charAt(i) - 'a']++;
		int len = s.length();
		while(len != 0) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i] > 0) {
					sb.append((char)(i+'a'));
					arr[i]--;
					len--;
				}
			}
			for(int i=arr.length-1;i>=0;i--) {
				if(arr[i] > 0) {
					sb.append((char)(i+'a'));
					arr[i]--;
					len--;
				}
			}
		}
		return sb.toString();
    }
	
	public static void main(String[] args) {
		System.out.println(sortString("aaaabbbbcccc"));
	}
}
