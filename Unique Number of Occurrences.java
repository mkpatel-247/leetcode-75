class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int num: arr){
            hmap.put(num, hmap.getOrDefault(num, 0)+1);
        }

        HashSet<Integer> hset = new HashSet<>(hmap.values());
        return hmap.size() == hset.size();
    }
}
