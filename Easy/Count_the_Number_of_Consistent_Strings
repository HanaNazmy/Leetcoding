// https://leetcode.com/problems/count-the-number-of-consistent-strings

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i< allowed.length(); i++)
        {
            if(!map.containsKey(allowed.charAt(i)))
                map.put(allowed.charAt(i),1);
        }
        int count = 0;
        String word;
        Boolean check;
        for(int i=0; i<words.length;i++)
        {
            check = true;
            word = words[i];
            for(int j=0; j<word.length();j++)
            {
                if(!map.containsKey(word.charAt(j)))
                    check = false;
            }
            if(check)
                count++;
        }
    return count;
    }
    
}
