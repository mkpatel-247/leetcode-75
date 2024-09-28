class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        int starCount = 0;

        for(int i = s.length()-1; i>=0; i--){
            
            if(s.charAt(i) == '*'){
                starCount++;
            } else if(starCount > 0){
                starCount--;
            } else {
                ans.insert(0, s.charAt(i));
            }
        }

        return ans.toString();
    }
}
