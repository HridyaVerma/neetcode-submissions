class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();

        for (char a: s.toCharArray())
        {
            if(a=='(' || a=='{' || a=='[')
            {
                stack.push(a);
            }
            else{
                if(stack.isEmpty())
                {
                    return false;
                }
                else if(a==')' && stack.peek()=='(' || 
                   a=='}' && stack.peek()=='{' ||
                   a==']' && stack.peek()=='[')
                {
                    stack.pop();
                }else{
                    return false;
                }
                    
            }
        }

        if(stack.isEmpty())
        {
        return true;
        }
        else{
            return false;
        }
        
    }
}
