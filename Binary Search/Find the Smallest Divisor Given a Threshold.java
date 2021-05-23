class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo = 1, hi = 1000000;
        int ans = 0;
        int n = nums.length;
        double[] num = new double[n];
        for(int i = 0; i < n; i+=1){
            num[i] = nums[i];
        }
        while(lo <= hi){
            int sum = 0;
            int mid = (lo + hi)/2;
            for(int i = 0; i < n; i+=1){
                sum += Math.ceil(num[i]/mid);
            }
            if(sum > threshold){
                lo = mid + 1;
            }else{
                ans = mid;
                hi = mid - 1;
            }
        }
        return ans;
    }
}