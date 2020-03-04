import java.util.*;

public class Problem950 {

	public static int[] deckRevealedIncreasing(int[] deck) {
		int[] ans = new int[deck.length];
		Queue<Integer> index = new LinkedList<>();
		for(int i=0;i<deck.length;i++)
			index.add(i);
		Arrays.sort(deck);
		for(int i=0;i<deck.length;i++) {
			ans[index.poll()] = deck[i];
			index.add(index.poll());
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] deck = {17,13,11,2,3,5,7 };
		deckRevealedIncreasing(deck);
	}
}
