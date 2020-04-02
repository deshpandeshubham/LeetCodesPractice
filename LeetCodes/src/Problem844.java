import java.util.*;

public class Problem844 {

	public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(int i=0;i<S.length();i++) {
        	char ch = S.charAt(i);
        	if(ch == '#') { 
        		if(!s1.isEmpty())
        			s1.pop();
        		else
        			continue;
        	}
        	else
        		s1.push(ch);
        }
        for(int i=0;i<T.length();i++) {
        	char ch = T.charAt(i);
        	if(ch == '#') { 
        		if(!s2.isEmpty())
        			s2.pop();
        		else
        			continue;
        	}
        	else
        		s2.push(ch);
        }
        String S1 = "", T1 = "";
        while(!s1.isEmpty())
        	S1 += s1.pop();
        while(!s2.isEmpty())
        	T1 += s2.pop();
        System.out.println(S1 + " " + T1);
		return S1.equals(T1);
    }
	
	public static void main(String[] args) {
		System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
	}
}
