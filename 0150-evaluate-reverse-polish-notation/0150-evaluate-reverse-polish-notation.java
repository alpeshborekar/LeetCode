class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        String op = "+-*/";

        for(String token : tokens){
            if(op.indexOf(token) != -1){
                int d1 = s.pop();
                int d2= s.pop();
                int res = 0;
                if(token.equals("+")){
                    res = d2 + d1;
                }else if(token.equals("-")){
                    res = d2-d1;
                }else if(token.equals("*")){
                    res = d2 * d1;
                }else if(token.equals("/")){
                    res = d2/d1;
                }
                s.push(res); 
            }else{
                s.push(Integer.parseInt(token));
            }
        }
         return s.peek();
    }
}