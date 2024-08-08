class Solution {
    public int calPoints(String[] operations) {
        int value=0;
        Stack<Integer> stack=new Stack<>();
        for(String v:operations)
        {
            if(v.equals("+"))
            {
                int a=stack.pop();
                int b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }
            else if(v.equals("C"))
            {
                stack.pop();
            }
            else if(v.equals("D"))
            {
                stack.push(stack.peek()*2);
            }
            else
            {
                stack.push(Integer.parseInt(v));
            }
        }
        while(!stack.isEmpty())
        {
            value+=stack.pop();
        }
        return value;
        
    }
}