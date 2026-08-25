class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int start=0;   //start at index 0
        int end=n-1;   //end at last index
        int mid=(start+end)/2;    // calculate mid
        while(start<=end){     
            if(nums[mid]==target){   //check if mid==target
                return mid;    //if present value return mid
            }
            else if(target>nums[mid]){
                start=mid+1;     //go to right side
            }
            else{
                end=mid-1;      //go to left side
            }
            mid=(start+end)/2;  //update mid because rearrange array
        }
        return -1; //if value not exits return
        
    }
}