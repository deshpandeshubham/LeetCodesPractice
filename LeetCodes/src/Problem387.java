import java.util.HashMap;

public class Problem387 {

	public static int firstUniqChar(String s) {
        
		/* Method - 1
		HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        	map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        for(int i=0;i<s.length();i++)
        	if(map.get(s.charAt(i)) == 1)
        		return i;
		return -1;*/
		
		//Method - 2
		
		int[] arr = new int[26];
		for(int i=0;i<s.length();i++)
			arr[s.charAt(i) - 'a']++;
		for(int i=0;i<s.length();i++) {
			if(arr[s.charAt(i) - 'a'] == 1)
				return i;
		}
		return -1;
    }
	
	public static void main(String[] args) {
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}
}
