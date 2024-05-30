class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count=0;
        int cnt=0;
        int c=0;
        for(int i =0; i<n; i++){
           if(nums[i] == 0){
            count++;
           }
        }

        for(int j =0; j<n ; j++){
            if(nums[j] == 1){
                cnt++;
            }
        }

        for(int k =0; k<n ; k++){
            if(nums[k] == 2){
                c++;
            }
        }
        int z=0;
        for(int l =0; l<count ; l++){
          nums[z] = 0;
          z++;
        }

       for(int l =0; l<cnt ; l++){
          nums[z] = 1;
          z++;
        }

        for(int l =0; l<c ; l++){
          nums[z] = 2;
          z++;
        }
    }
}