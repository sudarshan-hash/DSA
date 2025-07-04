package binarySearchAlgo;

public class binarySearch {

// Code for Binary Search Algo Iterative
    public final int Binary(int [] nums,int target){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while (start<=end){
            mid=start+(end-start)/2;

            if (target>nums[mid]){
                start=mid+1;
            }
            else if (target<nums[mid]) {
                end=mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }

    public static void main(String [] args){
        binarySearch search=new binarySearch();
        int [] nums={-1,0,3,5,9,12};
        int target=90;
        int index=search.Binary(nums,target);
        System.out.println(index);
    }
}
