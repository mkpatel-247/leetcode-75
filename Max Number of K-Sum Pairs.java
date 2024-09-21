class Solution {
    public int maxOperations(int[] nums, int k) {
        int cnt = 0;
        Arrays.sort(nums);

        int left = 0, right = nums.length-1;
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum == k){
                left++;
                right--;
                cnt++;
            } else if(sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return cnt;
    }
}
