class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0, j=0; i<nums.length; i++){
            if(nums[i] != 0){
                int swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
                j++;
            }
        }
    }
}
