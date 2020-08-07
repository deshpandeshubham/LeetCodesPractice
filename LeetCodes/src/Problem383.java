
public class Problem383 {

	public static boolean canConstruct(String ransomNote, String magazine) {
        int[] countArr = new int[26];
        for(int i=0;i<magazine.length();i++) 
        	countArr[magazine.charAt(i) - 'a']++;
        for(int i=0;i<ransomNote.length();i++) {
        	if(countArr[ransomNote.charAt(i) - 'a'] > 0)
        		countArr[ransomNote.charAt(i) - 'a']--;
        	else
        		return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "aa"));
	}
}
