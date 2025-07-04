package binarySearchAlgo;

// Leetcode 540


public class singleElementInSortedArray {

    int unique(int[] nums){
        // This if for Handaling Edge cases
        if(nums.length==1){return nums[0];}
        if(nums[0]!=nums[1]){return nums[0];}
        if (nums[nums.length-1]!=nums[nums.length-2]){return nums[nums.length-1];}

        // From this binary search approach start
        int st=1;
        int end=nums.length-1;
        int mid;
        while (st<=end){
            mid=st+(end-st)/2;
            // This for Checking unique
            if (nums[mid-1]!=nums[mid]&& nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            // This is for: even size of array left and right part
            else if (mid%2==0){
                if (nums[mid-1]==nums[mid]){
                    end=mid-1;
                }
                else {
                    st=mid+1;
                }
            }
            // This is for: odd size of array left and right part
            else {
                if (nums[mid-1]==nums[mid]){
                    st=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String []args){
    singleElementInSortedArray single=new singleElementInSortedArray();
    int [] nums={3,3,7,7,10,11,11};
    System.out.println(single.unique(nums));
    }
}
