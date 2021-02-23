// https://leetcode.com/problems/sort-array-by-parity-ii/

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] even = new int[A.length/2];
        int[] odd = new int[A.length/2];
        int index1=0;
        int index2=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)
                even[index1++] = A[i];
            else
                odd[index2++] = A[i];   
        }
        index1 = 0;
        index2 = 0;
        for(int j=0;j<A.length;j++)
        {
            if(j%2==0)
                 A[j] =even[index1++];
            else
                 A[j] =odd[index2++];  
        }
        return A;
    }
}
