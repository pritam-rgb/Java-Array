Problem:

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

 

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
Example 4:

Input: nums = [0]
Output: 1
Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in nums.
 

Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.

******************************************************************************************************************************
Solution:

import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int[] sequence=new int[n+1];
        for(int i=0;i<sequence.length;i++){
            sequence[i]=i;
            
        }
        Arrays.sort(nums);
        for(int j=0;j<n;j++){
            int current=nums[j];
            for(int k=0;k<n+1;k++){
                if(current==sequence[k]){
                    sequence[k]=-1;
                }
            }
        }
        for(int i=0;i<n+1;i++){
            if(sequence[i]!=-1)
                 ans=sequence[i];
        }
        return ans;
        
    }
}
