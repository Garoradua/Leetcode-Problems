class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                int n1 = st.pop();
                int n2 = st.pop();
                int finalresult = n1 + n2;
                st.push(finalresult); 
            }else if(tokens[i].equals("-") ){
                int n1 = st.pop();
                int n2 = st.pop();
                int finalresult = n2-n1;
                st.push(finalresult); 
            }else if(tokens[i].equals("/")){
                int n1 = st.pop();
                int n2 = st.pop();
                int finalresult = n2/n1;
                st.push(finalresult); 
            }else if(tokens[i].equals("*")){
                int n1 = st.pop();
                int n2 = st.pop();
                int finalresult = n2*n1;
                st.push(finalresult); 
            }else{
                st.push(Integer.parseInt(tokens[i]));  
            }
        }
        return st.peek();
    }
}