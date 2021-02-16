// https://leetcode.com/problems/decompress-run-length-encoded-list/

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> decompressedList = new ArrayList<>();
        int freq;
        int val;
        for(int i=0;i<nums.length; i+=2)
        {
            freq = nums[i];
            val = nums[i+1];
            for(int j=0;j<freq;j++)
                decompressedList.add(val);
        }
        int[] arr = new int[decompressedList.size()];
        for(int i = 0; i < decompressedList.size(); i++) 
            arr[i] = decompressedList.get(i);
        return arr;
    }
}
