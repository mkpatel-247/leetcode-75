class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res = 0;
        double avg = 0;

        int sum = 0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }

        avg = sum * 1.0/k;
        res = avg;

        for(int i=k; i<nums.length; i++){
            sum += nums[i] - nums[i-k];
            avg = sum * 1.0/k;
            res = Math.max(res, avg);
        }
        return res;
    }
}
