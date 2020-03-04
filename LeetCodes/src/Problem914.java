import java.util.*;

//Not Complete
public class Problem914 {

	public static boolean hasGroupsSizeX(int[] deck) {
        Arrays.sort(deck);
        int cnt = 0;
        for(int i=0;i<deck.length-1;i++) {
        	if(deck[i] == deck[i+1])
        		cnt++;
        	else
        		cnt--;
        }
        System.out.println(cnt);
        return true;
    }
	
	public static void main(String[] args) {
		int[] deck = {1};
		hasGroupsSizeX(deck);
	}
}
