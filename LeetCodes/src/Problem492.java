
public class Problem492 {

	public static int[] constructRectangle(int area) {
		int width = (int)Math.sqrt(area);
        for(int i=width;i>=1;i--)
            if(area % i == 0)
                return new int[]{area / i, i};
        return null;
    }
	
	public static void main(String[] args) {
		constructRectangle(4);
	}
}
