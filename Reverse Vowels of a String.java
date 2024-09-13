class Solution {
    private boolean checkVowel(char str){
        ArrayList<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        return vowels.contains(str);
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(checkVowel(arr[left]) && checkVowel(arr[right])){
                char swap = arr[left];
                arr[left] = arr[right];
                arr[right] = swap;
                left++;
                right--;
            } else if(!checkVowel(arr[left])){
                left++;
            } else{
                right--;
            }
        }
        return new String(arr);
    }
}
