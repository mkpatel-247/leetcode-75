class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }

        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> arr1 = new ArrayList<>();
        for(int i: set1){
            if(!set2.contains(i)) arr1.add(i);
        }
        ans.add(arr1);

        List<Integer> arr2 = new ArrayList<>();
        for(int i: set2){
            if(!set1.contains(i)) arr2.add(i);
        }
        ans.add(arr2);
        return ans;
    }
}
