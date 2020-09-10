import java.util.*;

public class Problem39 {
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(candidates);
		dfs(candidates, result, new ArrayList<>(), 0, target);
		return result;
    }
	
	private void dfs(int[] candidates, List<List<Integer>> result, List<Integer> combination, int index, int target) {
		if(target == 0) {
			result.add(new ArrayList<>(combination));
			return;
		}
		if(target < 0)
			return;
		for(int i=index;i<candidates.length;i++) {
			combination.add(candidates[i]);
			dfs(candidates, result, combination, i, target - candidates[i]);
			combination.remove(combination.size()-1);
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,3,6,7};
		new Problem39().combinationSum(arr, 7);
	}
}
