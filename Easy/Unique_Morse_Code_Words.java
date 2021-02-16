// https://leetcode.com/problems/unique-morse-code-words

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] encodings = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(int i=0; i<words.length; i++)
        {
            StringBuilder s = new StringBuilder("");
            char c;
            for(int j=0; j<words[i].length(); j++)
            {
                c = words[i].charAt(j);
                s.append(encodings[c-97]);
            }
            if(map.containsKey(s.toString()))
                map.replace(s.toString(), map.get(s.toString()) +1);
            else
                map.put(s.toString(),1);
        }
        return map.keySet().size();
    }
}
