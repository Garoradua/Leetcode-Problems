class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for(String x : operations){
            if(x.equals("+")){
                System.out.println(x);
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }else if(x.equals("D")){
                list.add(2*(list.get(list.size()-1)));
            }else if(x.equals("C")){
                int index = list.size()-1;
                list.remove(index);
            }else{
                list.add(Integer.parseInt(x));
            }
        }
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        return sum;
    }
}