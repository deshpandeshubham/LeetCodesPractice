import java.util.*;

public class Problem1054 {

	public int[] rearrangeBarcodes(int[] barcodes) {
        int[] result = new int[barcodes.length];
        int[] count = new int[1001];
        for(int b : barcodes)
        	count[b]++;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> count[b] - count[a]);
        for(int i=0;i<1001;i++)
        	if(count[i] != 0)
        		pq.add(i);
        int index = 0;
        while(pq.size() >= 2) {
        	int code1 = pq.poll();
        	int code2 = pq.poll();
        	result[index++] = code1;
        	result[index++] = code2;
        	count[code1]--;
        	count[code2]--;
        	if(count[code1] != 0)
        		pq.add(code1);
        	if(count[code2] != 0)
        		pq.add(code2);
        }
        if(!pq.isEmpty()) {
        	int code = pq.poll();
        	result[index] = code;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] barcodes = {1,1,1,2,2,2};
		 new Problem1054().rearrangeBarcodes(barcodes);
	}
}
