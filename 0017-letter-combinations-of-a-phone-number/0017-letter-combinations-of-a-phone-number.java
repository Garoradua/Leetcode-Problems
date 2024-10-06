class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('1', "");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> result = new ArrayList<>();
        if(digits.length()==0) return result;
        backTracking(digits, result, 0, map,new StringBuilder());
        return result;
    }

    public void backTracking(String digits, List<String> result, int i, Map<Character, String> map, StringBuilder sb){
        if(i==digits.length()){
            result.add(sb.toString());
            return;
        }
        String curr = map.get(digits.charAt(i));
        for(int k=0; k<curr.length(); k++){
            sb.append(curr.charAt(k));
            backTracking(digits, result, i+1, map, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}