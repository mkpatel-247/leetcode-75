class Solution {
    public int largestAltitude(int[] gain) {
        int highPoint = 0;
        int altitude = 0;
        
        for(int alt : gain){
            altitude += alt;
            highPoint = Math.max(highPoint, altitude); 
        }

        return highPoint;
    }
}
