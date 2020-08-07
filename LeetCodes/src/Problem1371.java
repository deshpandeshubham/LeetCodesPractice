import java.util.*;

public class Problem1371 {
	
	public static int findTheLongestSubstring(String s) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int state = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.println("ch : " + ch);
            switch (ch) {
                case 'a':
                    state ^= 1 << 0;
                    break;
                case 'e':
                    state ^= 1 << 1;
                    break;
                case 'i':
                    state ^= 1 << 2;
                    break;
                case 'o':
                    state ^= 1 << 3;
                    break;
                case 'u':
                    state ^= 1 << 4;
                    break;
                default:
                    break;
            }
            System.out.println("state : " + state);
            if (map.containsKey(state)) {
                res = Math.max(res, i - map.get(state));
                System.out.println("res : " + res);
            }
            else {
                map.put(state, i);
                System.out.println("Map : " + map);
            }
        }
        return res;
    }

	public static void main(String[] args) {
		findTheLongestSubstring("leetcodeisgreat");
	}
}
