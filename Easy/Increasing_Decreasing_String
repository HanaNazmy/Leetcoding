// https://leetcode.com/problems/increasing-decreasing-string

class Solution {
    public String sortString(String s) {
        int[] chars = new int[26];
        char c;
        for(int i =0;i< s.length();i++)
        {
            c = s.charAt(i);
            chars[c-97]+=1;
        }
        
        String st = "";
        while(st.length() < s.length()){
            // Increasing Substring
            for(int i=0; i< chars.length; i++)
            {
                if(chars[i] > 0)
                {
                    st = st + ((char)(i+97));
                    chars[i] -=1;
                }
            }
            // System.out.println(st);

            // Decreasing Substring
            for(int i=chars.length-1; i>=0; i--)
            {
                if(chars[i] > 0)
                {
                    st = st + ((char)(i+97));
                    chars[i] -=1;
                }
            }
            // System.out.println(st);
         }
    
        return st;
    }
}
