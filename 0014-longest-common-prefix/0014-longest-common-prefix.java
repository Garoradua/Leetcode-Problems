class Solution {
    public String longestCommonPrefix(String[] strs) {
      Arrays.sort(strs);
      String start = strs[0];
      String end = strs[strs.length-1];
      StringBuilder prefix = new StringBuilder();
      int i = 0;
      while(i<start.length() && i<end.length() && start.charAt(i)==end.charAt(i)){
        prefix.append(start.charAt(i));
        i++;
      }  
      return prefix.toString();
    }
}