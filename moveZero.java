Question:
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

******************************************************************************************************************

Solution:
  
    public static void moveZero(int[] arr) {
      if(arr.length==0)
        return;
      int n=arr.length;
      for(int i=0;i<n;i++) {
        int temp1=arr[i];
        for(int j=0;j<n-1;j++) {
          int temp=arr[j];
          if(temp==0) {
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
        }

      }
	}
