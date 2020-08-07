import java.util.Arrays;

public class Problem881 {
	
	public static int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int i=0, j=people.length - 1;
        while(i <= j) {
        	boats++;
        	if(people[i] + people[j] <= limit)
        		i++;
        	j--;
        }
		return boats;
    }

	public static void main(String[] args) {
		int[] people = {3,2,2,1};
		numRescueBoats(people, 3);
	}
}
