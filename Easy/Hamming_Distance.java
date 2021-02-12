// https://leetcode.com/problems/hamming-distance/

class Solution {
    public int hammingDistance(int x, int y) {
        // Binary of 8 bits
        String xBin = String.format("%32s", Integer.toBinaryString(x)).replace(" ","0");
        String yBin = String.format("%32s", Integer.toBinaryString(y)).replace(" ","0");
        int count = 0;
        for (int i = 0; i < xBin.length(); i++){
            if ((xBin.charAt(i) - yBin.charAt(i)) !=0)
                    count++;    
        }
        return count;
    }
}
