//using recursion
class Solution {
    public int numberOfMatches(int n) {
        return matches(n, 0);
    }
    
    public int matches(int n, int match){
        if(n == 1){
            return match;
        }
        
        if((n&1) == 0){
            return matches(n/2, match + n/2);    
        }else{
            return matches(n/2 + 1, match + n/2);    
        }
        
    }
}
// time complexity -> O(logn);
// space complexity -> O(1);