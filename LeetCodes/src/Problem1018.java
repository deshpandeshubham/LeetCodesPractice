import java.util.*;

public class Problem1018 {

	public static List<Boolean> prefixesDivBy5(int[] A) {
		List<Boolean> prefixes = new ArrayList<>();
		int num = 0;
        for(int i: A) {
            num = (num * 2 + i) % 5; 
            System.out.println(num);
            prefixes.add(num % 5 == 0);
        }
        return prefixes;
    }
	
	public static void main(String[] args) {
		int[] A = {1,1,1,1};
		prefixesDivBy5(A);
	}
}
