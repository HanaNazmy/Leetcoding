// https://leetcode.com/problems/to-lower-case

class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb=new StringBuilder("");
        char c;
        for (int i=0;i< str.length();i++)
        {
            c = str.charAt(i);
            if (c >= 'A' && c <= 'Z')
            {
                sb.append((char)(c+32));
            }
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
