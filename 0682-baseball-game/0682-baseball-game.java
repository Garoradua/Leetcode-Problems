class Solution {
    public int calPoints(String[] operations) {
        int[] operation = new int[operations.length];
        int index = 0;
        for(String s : operations){
            switch(s){
                case "+" : operation[index] = operation[index-1] + operation[index-2];
                            index++;
                            break;
                
                case "D" : operation[index] = 2*operation[index-1];
                            index++;
                            break;

                case "C" : index--;
                            break;

                default : operation[index] = Integer.parseInt(s);
                            index++;
            }
        }
        int sum = 0;
        for(int i =0; i<index; i++){
            sum += operation[i];
        }
        return sum;
    }
}