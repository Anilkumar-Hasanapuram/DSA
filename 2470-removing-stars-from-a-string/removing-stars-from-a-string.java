class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='*')
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<stack.size();i++)
        {
            sb.append(stack.get(i));
        }
        return sb.toString();
    }
}