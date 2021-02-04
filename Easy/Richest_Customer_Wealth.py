class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max_wealth = 0
        curr_wealth = 0
        for i in range(len(accounts)):
            curr_wealth = sum(accounts[i])
            if max_wealth < curr_wealth :
                max_wealth = curr_wealth
        
        return max_wealth