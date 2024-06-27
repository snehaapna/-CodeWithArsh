class Solution {
    public int minStartValue(int[] nums) {
      int total=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            int val=1;
            if(total<1){
                val=(total*-1)+1;
                }
            if(val>result)
                result=val;
            }
        return result;
    }
}