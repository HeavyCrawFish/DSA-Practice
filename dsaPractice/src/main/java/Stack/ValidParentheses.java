package Stack;
import java.util.*;
public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String brackets = "[]";
		
		System.out.println(isValid(brackets));

	}

	private static boolean isValid(String brackets) {
		Map<Character,Character> map = new HashMap<>();
		map.put('(',')');
		map.put('{','}');
		map.put('[',']');
		
		
		Stack<Character> st = new Stack<>();
		
		if(brackets.length() == 0) {
			return false;
		}
		for(int i=0;i<brackets.length();i++) {
			if(brackets.charAt(i) == '(' || brackets.charAt(i) == '{' || brackets.charAt(i) == '[') {
				st.push(brackets.charAt(i));
			}
			else if (brackets.charAt(i) == ')' || brackets.charAt(i) == '}' || brackets.charAt(i) == ']') {
				if(map.get(st.peek()) == null) {
					return false;
				}
				else if(map.get(st.peek()) == brackets.charAt(i)) {
					st.pop();
				} else {
					st.push(brackets.charAt(i));
				}
			}
		}
		if(st.size() == 0) {
			return true;
		}
		return false;
	}

}
