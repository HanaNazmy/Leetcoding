class Solution:
    def hammingWeight(self, n: int) -> int:
        binaryVal = format(n, "b")
        count = 0
        # print(type(binaryVal))
        for c in binaryVal:
            if c == '1':
                count = count +1
                
        return count
