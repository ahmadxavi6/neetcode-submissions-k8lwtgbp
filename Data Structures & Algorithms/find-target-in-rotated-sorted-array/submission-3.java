class Solution {
    public int search(int[] nums, int target) {
        int counter = 0;
        for(int i = 1 ; i<nums.length ;i++){
            counter++;
            if(nums[i] < nums[i-1]){
                break;
            }
        }
        int i =0;
        int j = counter-1;
        int mid = 0;
        while(i<=j){
            mid = i + (j-i) /2;
            if(nums[mid]== target){
                return mid;
            }
            if(nums[mid] < target){
             i = mid+1;
            }else{
                
                 j = mid-1;
            }
        }

        i = counter;
        j = nums.length-1;
        mid = 0;
        while(i<=j){
             mid = i + (j-i) /2;
            if(nums[mid]== target){
                return mid;
            }
            if(nums[mid] < target){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return -1;
    }
}
