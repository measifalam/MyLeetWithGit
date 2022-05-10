class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder string = new StringBuilder();
        for(char c : s.toCharArray())
        {
          if(c=='(')
          {
            if(!stack.isEmpty())
            {
              string.append(c);
            }
            stack.add(c);
          }
          else
          {
            stack.pop();
            if(!stack.isEmpty())
            {
              string.append(c);
            }
          }
        }
      return string.toString();
    }
}