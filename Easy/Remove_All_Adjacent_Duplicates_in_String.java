// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();
        for(int i= S.length()-1;i>=0; i--)
        {
            if (!st.empty() && st.peek() == S.charAt(i))
            {
                st.pop();
            }
            else
            {
                st.push(S.charAt(i));
            }
        }
        String smallS="";
        while(!st.empty())
        {
            smallS += st.pop();
        }
        return smallS;
    }
}
