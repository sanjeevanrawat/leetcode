class Solution {
    public boolean checkZeroOnes(String s) {
        int currOne = 0;
        int maxOne = 0;
        int currZero = 0;
        int maxZero = 0;
        for(int i = 0; i < s.length(); i++){
            // char c = s.charAt(i);
            if(s.charAt(i) == '1'){
                currOne += 1;
                currZero = 0;
                if(maxOne < currOne){
                    maxOne = currOne;
                }
            }else{
                currOne = 0;
                currZero += 1;
                if(maxZero < currZero){
                    maxZero = currZero;
                }
            }
        }
        return maxOne > maxZero;
    }
}
// time complexity -> O(n);
// space complexity -> O(1);