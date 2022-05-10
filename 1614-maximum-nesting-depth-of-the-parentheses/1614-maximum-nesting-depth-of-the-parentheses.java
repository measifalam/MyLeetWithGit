class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int max =0;
        
        for(char c:s.toCharArray())
        {
          if(c=='(')
          {
            stack.add(c);
            if(stack.size()>max)
            {
              max=stack.size();
            }
          }
          if(c==')')
          {
            stack.pop();
          }
        }
      return max;
    }
}