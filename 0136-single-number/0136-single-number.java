class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i =0;
        for( i=0; i< nums.length-1; i+=2){
            if(nums[i+1] == nums[i]){
               continue;
            }
           else{
            break;
           }
        }
        return nums[i];
    }
}