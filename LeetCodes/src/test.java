import java.util.*;

class test {
	
	public static void getResult(String expr) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<expr.length();i++) { 
			if(map.containsKey(expr.charAt(i)))
				map.put(expr.charAt(i), map.get(expr.charAt(i)) + 1);
			else
				map.put(expr.charAt(i), 1);
			//map.put(expr.charAt(i), map.getOrDefault(expr.charAt(i), 0) + 1);
		}
		String str="";
		for(Map.Entry<Character, Integer> e : map.entrySet()) {
			str += String.valueOf(e.getKey())+String.valueOf(e.getValue());
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		getResult("abccab");
	}
}