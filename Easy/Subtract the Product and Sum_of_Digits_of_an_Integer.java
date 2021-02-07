// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    public int subtractProductAndSum(int n) {
        String num = Integer.toString(n);
        if(num.length() == 1)
            return 0;
        return getProduct(num) - getSum(num);
}
    public int getSum(String num)
    {
        int sum=0;
        for(int i=0; i<num.length(); i++)
        {
           sum += Integer.parseInt(String.valueOf(num.charAt(i))); 
        }
        return sum;
    }

     public int getProduct(String num)
    {
        int product = 1;
        for(int i=0; i<num.length(); i++)
        {
           product *= Integer.parseInt(String.valueOf(num.charAt(i))); 
        }
        return product;
    }

}
