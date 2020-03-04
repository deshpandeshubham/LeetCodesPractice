import java.util.*;

public class Problem830 {

	public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> groups = new ArrayList<>();
        for(int i=0;i<S.length();) {
        	int j = i;
        	while(j<S.length() && S.charAt(i) == S.charAt(j))
        		j++;
        	if(j - i >= 3)
        		groups.add(Arrays.asList(i, j-1));
        	i = j;
        }
        return groups;
    }
	
	public static void main(String[] args) {
		largeGroupPositions("abcdddeeeeaabbbcd");
	}
}
