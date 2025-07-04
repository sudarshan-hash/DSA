package binarySearchAlgo;

//Leetcode Problem 852.
//Finding the peak index
//using binary search approach

public class peakIndex {
    int peak(int[] nums){
        int start=1;   // Here we start from 1 because in question mention that an leat one peak element is present
        int end=nums.length-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            //This is for checking mid element is peak element
            if (nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return mid;
            }
            // From this to down so tricky to understand ...
            // This is for: in which part of array we need to search for means for updating the start and end value
            else if (nums[mid-1]>nums[mid]) {
                end=mid-1;
            }
            else   {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        peakIndex peak=new peakIndex();
        int [] nums={0,2,3,4,5,2,5,};
        System.out.println(peak.peak(nums));
    }
}
