import java.util.HashSet;

public class Problem202 {
	 public static boolean isHappy(int n) {
	        if(n==2) 
	        	return false;
	        if(n==1) 
	        	return true;
	        HashSet<Integer> set = new HashSet<>();
	        int sum =0;
	        while(set.add(sum)){
	            sum = helper(n);
	            System.out.println("Sum : " + sum);
	            n = sum;
	        }
	        if(sum==1) 
	        	return true;
	        return false;
	    }
	    
	    private static int helper(int num){
	        int sum=0;
	        while(num>0){
	            int temp = num%10;
	            if(temp>0) sum=sum+temp*temp;
	            num=num/10;
	        }
	        return sum;
	    }
	
	   public static void main(String[] args) {
		   System.out.println(isHappy(19));
	   }
}
