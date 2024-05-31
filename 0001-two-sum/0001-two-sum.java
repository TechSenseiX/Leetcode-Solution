class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            
            // Add the current number and its index to the map
            map.put(nums[i], i);
        }
        return new int[0];
    
    }
}















        //here we can not sort the array because we have to return the index
//         int ans[] = new int[2];
//         int n = nums.length;
//         Arrays.sort(nums);
//         //two pointer approach
//         int start = 0;
//         int end = n-1;

//         while(start < end){
//             int sum= nums[start]+nums[end];
//             if(sum==target){
//                 ans[0]=start;
//                 ans[1]=end;
//             }
//            else if(sum<target){
//                  start++;
//             }
//           else {
//             end--;
//           }
//         }
        
//       return ans;
      
//     }
// }