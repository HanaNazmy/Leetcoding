// https://leetcode.com/problems/find-numbers-with-even-number-of-digits

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        String str = "";
        for (int i=0; i<nums.length; i++){
            str = Integer.toString(nums[i]);
            if (str.length() % 2 == 0)
                count ++;
        }
        return count;
    }
}
