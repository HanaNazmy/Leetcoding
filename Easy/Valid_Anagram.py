# https://leetcode.com/problems/valid-anagram/

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        mydict = {}
        
        # filling the dict
        for c in s:
            if c in mydict:
                mydict[c] = mydict[c] +1
            else:
                mydict[c] = 1
                
        # checking 2nd str in dict          
        for x in t:
            if not x in mydict:
                return False
            else:
                mydict[x] = mydict[x] -1
                
        # if mydict has values != 0 return False
        for x in mydict.values():
            if x !=0:
                return False
        return True
                
