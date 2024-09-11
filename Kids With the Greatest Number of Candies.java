class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i: candies){
            max = Math.max(max, i);
        }
        
        List<Boolean> ans = new ArrayList<Boolean>();
        for(int candy : candies){
            ans.add(candy+extraCandies >= max);
        }
        return ans;
    }
}
