import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(')', '(', '}', '{', ']', '[');
		Stack<Character> stack = new Stack<>();

		for (Character c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (stack.isEmpty() || stack.pop() != map.get(c)) {
				return false;
			}
		}
        return stack.isEmpty();
    }
}