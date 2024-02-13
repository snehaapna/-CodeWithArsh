class Solution {
    public int majorityElement(int[] nums) {
        //hashmap creation with value and cout of value
        HashMap<Integer,Integer> element=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            element.put(nums[i],element.getOrDefault(nums[i],0)+1);
        }
       int n=nums.length;
           int m=n/2;
        for(HashMap.Entry<Integer,Integer> entry:element.entrySet()){
               if(entry.getValue()>m){
                   return entry.getKey();
               }
        }
        return 0;
    }
}


