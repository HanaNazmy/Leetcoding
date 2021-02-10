# https://leetcode.com/problems/xor-operation-in-an-array/

import numpy

class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        xor_num = 0
        nums = []
        for i in range(n):
            # nums.append(start + 2*i)
            xor_num = numpy.bitwise_xor(xor_num, start + 2*i)
            
        return xor_num
        
