class Solution {
    class TrieNode{
        TrieNode child[] = new TrieNode[26];
        boolean isEnd;
    }
     TrieNode root = new TrieNode();
    public String longestCommonPrefix(String[] strs) {
        for(int i=0; i<strs.length; i++){
            putIntotrie(strs[i]);
        }
        
        return findLongestCommonPrefix(strs[0]);
    }

    public String findLongestCommonPrefix(String str){
        StringBuilder prefix = new StringBuilder();
        TrieNode curr = root;
        for(char c : str.toCharArray()){
            int index = c-'a';
            if(curr.child[index]!=null && countNode(curr)==1 && curr.isEnd == false){
                curr = curr.child[index];
                prefix.append(c);
            }else{
                break;
            }
        }
        return prefix.toString();
    }

    public int countNode(TrieNode curr){
        int count = 0;
        for(int i=0; i<26; i++){
            if(curr.child[i]!=null) count++;
        }
        return count;
    }
    public void putIntotrie(String str){
        TrieNode curr = root;
        for(int i=0; i<str.length(); i++){
            int index = str.charAt(i)-'a';
            if(curr.child[index]==null) curr.child[index] = new TrieNode();
            curr = curr.child[index];
        }
        curr.isEnd = true;
    }
}