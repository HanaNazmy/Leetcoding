# https://leetcode.com/problems/shuffle-the-array/
class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        new_list = []
        j = n
        for i in range(n):
            new_list.append(nums[i])
            new_list.append(nums[j])
            j = j+1
        return new_list
        