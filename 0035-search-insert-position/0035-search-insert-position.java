class Solution {
    public int searchInsert(int[] nums, int target) {
    //    for(int i = 0;i < n;i++){
    //     if()
    //    }
        int a = 0;
        int n = nums.length-1;
        while(a<= n){
            int mid = a + (n-a)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                a = mid+1;
            }
            else{
                n = mid-1;
            }
        }
        return a;
    }
}