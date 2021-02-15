// https://leetcode.com/problems/shuffle-string/

class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> map = new HashMap<>();
        for(int i=0; i<s.length() ;i++)
        {
            map.put(indices[i],s.charAt(i));
        }
        
        s = "";
        for(int i=0; i<indices.length;i++)
        {
            s += map.get(i);
        }
        return s;
        
    }
}
