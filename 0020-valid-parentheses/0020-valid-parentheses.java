class Solution {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            if(x=='(' || x=='{' || x=='[') s.push(x);
            else if(x==')' || x=='}' || x==']'){
                if(s.isEmpty() || checkSequence(s.pop(), x)==false) return false;
            }
        }
        return s.isEmpty();
    }
    public boolean checkSequence(char start, char end){
        return (start=='(' && end==')') || (start=='{' && end=='}') || (start=='[' && end==']');
    }
}