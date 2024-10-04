class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> hmap = new HashMap<>();

        for(int i=0; i<grid.length; i++){
            String str = "";
            for(int j=0; j<grid[0].length; j++){
                str += grid[i][j]+" ";
            }
            hmap.put(str, hmap.getOrDefault(str, 0)+1);
        }
        int res = 0;

        for(int i=0; i<grid.length; i++){
            String str = "";
            for(int j=0; j<grid[0].length; j++){
                str += grid[j][i]+" ";
            }
            int count = hmap.get(str) != null ? hmap.get(str) : 0;
            if(count > 0){
                res += count;
            }
        }
        return res;
    }
}
