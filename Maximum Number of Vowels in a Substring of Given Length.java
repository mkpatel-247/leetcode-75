class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        int count = 0;

        for(int i=0; i<k; i++){
            count += isVowel(s.charAt(i));
        }
        ans = count;

        for(int i=k; i<s.length(); i++){
            count += isVowel(s.charAt(i));
            count -= isVowel(s.charAt(i-k));
            ans = Math.max(count, ans);
        }

        return ans;
    }

    private int isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') ? 1 : 0;
    }
}
