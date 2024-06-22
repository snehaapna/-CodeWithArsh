class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }else{
                nums[i]=1;
            }
       }
        int sum=0;
        int ans=0;
        int mp[]=new int[nums.length+1];
        mp[0]++;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]; 
            if((sum-k)>=0)
            ans+=mp[sum-k]; 
            mp[sum]++;
        }
        return ans;
    }
}
