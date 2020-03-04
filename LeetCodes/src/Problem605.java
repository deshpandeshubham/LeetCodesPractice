public class Problem605 {

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++) {
        	if(flowerbed[i] == 0) {
        		if(i == 0) {
        			if(flowerbed[i+1] != 1)
        				n--;
        			else
        				continue;
        		}
        		else if(i == flowerbed.length - 1 && flowerbed[i-1] != 1) { 
        			n--;
        		}
        		else {
        			System.out.println("else at : " + i);
        			if(flowerbed[i-1] != 1 && flowerbed[i+1] != 1) {
        				System.out.println("else if");
        				flowerbed[i] = 1;
        				n--;
        			}
        		}
        	}
        }
        for(int num : flowerbed)
        	System.out.print(num + " ");
        System.out.println("n"+n);
		return n == 0;
    }
	
	public static void main(String[] args) {
		int[] arr = {0,0};
		System.out.println(canPlaceFlowers(arr, 2));
	}
}
