class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int min = 1, max = 10000000, ans = -1;
        int n = dist.length;
        while(min <= max){
            int mid = (min + max)/2;
            double time = 0;
            for(int i = 0; i < n - 1; i+=1){
                time += Math.ceil((double) dist[i]/mid);
            }
            time += (double)dist[n - 1] /mid;
            // System.out.println(time);
            if(time > hour){
                min = mid + 1;
            }else{
                ans = mid;
                max = mid - 1;
            }
        }
        return ans;
    }
}
// time complexity -> O(logn);
// space complexity -> O(1);