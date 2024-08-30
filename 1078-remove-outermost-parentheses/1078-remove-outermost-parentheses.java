class Solution {
    public String removeOuterParentheses(String s) {
       char[] charArray = s.toCharArray();
       int len = charArray.length;
       StringBuilder newS = new StringBuilder();
       int open = 0;
       for(int i=0; i<len; i++){
        if(charArray[i]=='('){
            open++;
            if(open>1) newS.append('(');
        }else{
            if(open>1) newS.append(')');
            open--;
        }
       }
       return newS.toString();
    }
}