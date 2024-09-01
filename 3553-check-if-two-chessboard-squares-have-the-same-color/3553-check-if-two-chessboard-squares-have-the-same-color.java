class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int a = coordinate1.charAt(0)-'a' + coordinate1.charAt(1)-'1';
        int b = coordinate2.charAt(0)-'a' + coordinate2.charAt(1)-'1';

        return a%2 == b%2;
    }
}