package binarySearchAlgo;
// Leetcode problem 33
//Problem on binary search (1)
// So problem logic is hard

public class searchRoatedSortedArray{

    public int search(int[] nums,int target){
        int st=0;
        int end=nums.length-1;
        int mid;
    while(st<=end){
        mid=st+(end-st)/2;
        if(target==nums[mid]){
            return mid;
        }
        // Caking for the Left part is sorted
        else if(nums[st]<=nums[mid]){
            if (target>=nums[st] && target<=nums[mid]){
                    end=mid-1;
            }
            else {
                st=mid+1;
            }
        }
        // for right part sorted
        else {
            if (target>=nums[mid] && target<=nums[end]){
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
    }
        return -1;
    }

    public static void main(String [] args){
        searchRoatedSortedArray search=new searchRoatedSortedArray();
    int[] nums={4,5,6,7,0,1,2};
    int target=0;
    System.out.println(search.search(nums,4));
    }
}