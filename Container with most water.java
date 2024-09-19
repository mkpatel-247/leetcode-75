class Solution {
    public int maxArea(int[] height) {
        int ans = 0;

        int leftIdx = 0;
        int rightIdx = height.length-1;
        while(leftIdx < rightIdx){
            int left = height[leftIdx];
            int right = height[rightIdx];

            int area = Math.min(left, right) * (rightIdx - leftIdx);
            ans = Math.max(ans, area);

            if(left < right) 
                leftIdx++;
            else
                rightIdx--;
        }
        return ans;
    }
}
