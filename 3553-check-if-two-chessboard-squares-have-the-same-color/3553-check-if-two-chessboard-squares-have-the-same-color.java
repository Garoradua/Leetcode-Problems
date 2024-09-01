class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char a = coordinate1.charAt(0);
        char b = coordinate2.charAt(0);
        int b1 = (int)coordinate1.charAt(1);
        int b2 = (int)coordinate2.charAt(1);
        int a1 = a - 'a';
        int a2 = b - 'a';
        int count = 0;
        if(a1%2==0 && b1%2!=0 || a1%2!=0 && b1%2==0) count++;
        if(a2%2==0 && b2%2!=0 || a2%2!=0 && b2%2==0) count++;

        if(count==2 || count==0) return true;
        else return false;
    }
}