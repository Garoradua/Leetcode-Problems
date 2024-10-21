class Solution {
    public int countCollisions(String directions) {
       char[] charArray = directions.toCharArray();
        int collission = 0;
        int RsandLs = 0;
       for(int i=0; i<charArray.length-1; i++){
        if(charArray[i]=='R' && charArray[i+1]=='L'){
            collission += 2 + RsandLs;
            charArray[i+1] = 'S';
            RsandLs = 0;
        }else if(charArray[i]=='S' && charArray[i+1]=='L'){
            collission += 1 + RsandLs;
            charArray[i+1] = 'S';
            RsandLs = 0;
        }else if(charArray[i]=='R' && charArray[i+1]=='S'){
            collission += 1 + RsandLs;
            charArray[i+1] = 'S';
            RsandLs = 0;
        }else if(charArray[i]=='R' && charArray[i+1]=='R'){
            RsandLs++;
        }else if(charArray[i]=='L' && charArray[i+1]=='L'){
            RsandLs++;
        }else {
             RsandLs = 0;
        }
       } 

       return collission;
    }
}