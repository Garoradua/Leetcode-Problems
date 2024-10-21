class Solution {
    public int countCollisions(String directions) {
        // int rightCount = 0;
        // int collission = 0;
        // boolean started = false;
        // for(char car : directions.toCharArray()){
        //     if(car!='L')started=true;
        //     if(car=='R') rightCount++;
        //     else if(car=='L'){
        //         if(rightCount > 0){
        //             collission += rightCount + 1;
        //             rightCount = 0;
        //         }else{
        //             if(started==true) collission+=1;
        //         }
        //     }else{
        //         if(rightCount >0){
        //             collission += rightCount;
        //             rightCount = 0;
        //         }
        //     }
        // }

        // return collission;
     char[] charArray = directions.toCharArray();
     int n = charArray.length;
     int i = 0;
     int j = n-1;
       while(i < n){
            if(charArray[i]=='L') i++;
            else break;
       }
       while(j>=0){
            if(charArray[j]=='R') j--;
            else break;
       }
        int collission = 0;
       for(int k=i; k<=j; k++){
            if(charArray[k]!='S') collission++;
       }

        return collission;
    }

   
}