class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i =m-1;
    int j = n-1;
    int k = m+n-1;

    while(j >= 0){
        if(i>= 0 && nums1[i] > nums2[j]){
            nums1[k] = nums1[i];
            k--;
            i--;
        }else{
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }

    
    
    
    //    m = nums1.length;
    //    n = nums2.length;
    // int i=0;
    // int j =n-1;
    //    int len = m+n;
    //    int[] res = new int[len];
    //    int k =0;
    //    {
    //     if(nums1[i] < nums2[i]){
    //         res[k] = nums1[i];
    //         k++;
    //     }
    //     else{
    //         res[k] = nums2[i];
    //         k++;
    //     }
    //    }
       
       
       
       
       
        // int i= 0;
        // int j = nums2.length;
        // int k = 0;

        // while(j>=0){
        //     if(i>0 &&nums1[i] < nums2[k]){
        //         i++;
        //     }
        //     else{
        //         nums1[j] = nums1[i];
        //         j++;
        //         nums1[i] = nums2[k];
        //         i++;
        //         k++;
        //     }
        // }
    }
}