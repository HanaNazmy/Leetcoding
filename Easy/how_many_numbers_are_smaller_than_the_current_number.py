class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        nums_sorted = nums.copy()
        nums_sorted.sort()
        ans = []
        for i in range(len(nums)):
            count = 0
            for j in range(len(nums)):
                if nums[i] == nums_sorted[j]:
                    break
                else:
                    count = count+1
            ans.append(count)
        return ans;