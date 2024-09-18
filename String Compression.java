class Solution {
    public int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        // char prev = chars[0];
        int count = 1;
        str.append(chars[0]);
        for(int i=1; i<chars.length; i++){
            System.out.print(i + " ");
            if(chars[i] == chars[i-1]){
                count++;
            } else {
                if(count > 1) str.append(count);
                str.append(chars[i]);
                count = 1;    
            }
        }
        
        if(count > 1) str.append(count);
        //Change the existing char array to a new string compression.
        String compressedString = str.toString();
        for(int i=0; i<compressedStr.length(); i++){
            chars[i] = compressedStr.charAt(i);
        }
        return compressedString.length();
    }
}
