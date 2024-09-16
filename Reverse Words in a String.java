class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        StringBuilder res = new StringBuilder();
        for(int i=len-1; i>=0; i--){
            if(s.charAt(i) == ' ')
                continue;
            int end = i;
            while(i >=0 && s.charAt(i) != ' ')
                i--;
            res.append(s.substring(i+1, end+1)).append(" ");
        }
        return res.toString().trim();
    }
}
