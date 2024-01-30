class Solution {
public static void reverse(int num[],int start,int end){
        while(start<end){
             // swap
        int temp=num[start];
        num[start]=num[end];
        num[end]=temp;
        start++;
        end--;}
}

    public void rotate(int[] nums, int k) {
        k%=nums.length;
        //reverse whole array
        reverse(nums,0,nums.length-1);
        //reverse kth element
        reverse(nums,0,k-1);
      //Reverse remaining elements
        reverse(nums,k,nums.length-1);
    }
}

 



