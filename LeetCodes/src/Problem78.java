import java.util.*;

public class Problem78 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        dfs(result, 0, nums, new ArrayList<>());
        return result;
    }
    
    private static void dfs(List<List<Integer>> res, int start, int[] arr, List<Integer> temp) {
        for(int i=start;i<arr.length;i++) {
        	System.out.println("i : " + i);
            temp.add(arr[i]);
            System.out.println("Temp : " + temp);
            res.add(new ArrayList<>(temp));
            System.out.println("Result : " + res);
            dfs(res, i+1, arr, temp);
            temp.remove(temp.size() - 1);
        }
    }

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		subsets(nums);
	}
}
