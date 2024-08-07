class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = " ";
        String second =  " ";
        for(String a : word1){
            first += a;
        }
        System.out.println(first);
        for(String b : word2){
            second += b;
        }
         System.out.println(second);
        if(first.equals(second)) return true;
        else return false;
    }
}