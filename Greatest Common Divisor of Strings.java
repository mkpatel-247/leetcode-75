class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str2+str1).equals(str1+str2))
            return "";
        int ans = GCD(str1.length(), str2.length());
        return str1.substring(0, ans);
    }

    private int GCD(int a, int b){
        return b == 0 ? a : GCD(b, a % b);
    }
}
