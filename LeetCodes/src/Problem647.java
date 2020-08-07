import java.util.*;

public class Problem647 {
	//Brute Force
	public static int countSubstrings(String s) {
        int cnt = 0;
        for(int i=0;i<s.length();i++) {
        	for(int j=i+1;j<=s.length();j++) {
        		String temp = s.substring(i, j);
        		if(isPalindrome(temp))
        			cnt++;
        	}
        }
        return cnt;
    }
	
	//Expand around center
	public static int expandAroundCenter(String str) {
		int cnt = 0;
		int len = str.length();
		for(int i=0;i<=2*len-1;i++) {
			int left = i / 2;
			int right = left + i % 2;
			System.out.println(left + " : " + i + " : "+ right);
			while(left >=0 && right < len && str.charAt(left) == str.charAt(right)) {
				cnt++;
				left--;
				right++;
			}
		}
		return cnt;
	}  
	
	private static boolean isPalindrome(String str) {
		int i=0, j=str.length() - 1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(countSubstrings("aaa"));
		System.out.println(expandAroundCenter("aaa"));
	}
}
