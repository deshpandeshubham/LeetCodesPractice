import java.util.*;

public class Problem139 {
	
	public boolean wordBreak(String s, List<String> wordDict) {
		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for(int len=1;len<=s.length();len++) {
			for(int i=0;i<len;i++) {
				if(dp[i] && wordDict.contains(s.substring(i, len)))
					dp[len] = true;
			} 
		}
		return dp[s.length()];
    }

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("cats");
		list.add("dog");
		list.add("sand");
		list.add("and");
		list.add("cat");
		System.out.println(new Problem139().wordBreak("catsandog", list));
	}
}
