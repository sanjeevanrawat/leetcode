//using simple while loop
class Solution {
    public int numberOfMatches(int n) {
        int totalMatches = 0;
        while(n > 1){
            if((n & 1) == 0){
                totalMatches += n/2;
                n = n/2;
            }else{
                totalMatches += n/2;
                n = n/2 + 1;
            }
        }
        return totalMatches;
    }
}
// time complexity -> O(logn);
// space complexity -> O(1);