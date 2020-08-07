import java.util.*;

public class Problem1324 {
	
	public static List<String> printVertically(String s) {
		//Brute Force - o(n*n)
        /*List<String> result = new ArrayList();
        String[] arr = s.split(" ");
        int maxLen = 0, index = 0;;
        for(int i=0;i<arr.length;i++) {
        	String str = arr[i];
        	if(maxLen < str.length()) {
        		maxLen = str.length();
        		index = i;
        	}
        }
        for(int i=0;i<maxLen;i++) {
	        String temp = "";
	        for(int j=0;j<arr.length;j++) {
	        	String strarr = arr[j];
	        	if(strarr.length() <= i)
	        		temp += " ";
	        	else 
	        		temp += strarr.charAt(i);
	        }
	        result.add(temp.replaceAll("\\s+$", ""));
        }
        System.out.println(result);
        return result;*/
		return null;
    }

	public static void main(String[] args) {
		printVertically("CONTEST IS COMING");
	}
}
