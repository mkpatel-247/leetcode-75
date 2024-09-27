class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        int N = 26;
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for(char c: word1.toCharArray()){
            arr1[c-'a']++;
        }
        for(char c: word2.toCharArray()){
            arr2[c-'a']++;
        }
        
        //Check the word are present in both the array.
        for(int i=0; i<26; i++){
            if((arr1[i]==0 && arr2[i]!=0) || (arr1[i]!=0 && arr2[i]==0)){
                return false;
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr1){
            if(i>0){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }

        for(int i: arr2){
            if(i>0){
                if(!map.containsKey(i)){
                    return false;
                }

                map.put(i, map.get(i)-1);
                if(map.get(i) == 0){
                    map.remove(i);
                }
            }
        }

        return map.size() == 0;
    }
}
