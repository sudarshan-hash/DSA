// Leetcode code problem 26 and 27

import java.util.Vector;


public class removeElement_Dublicate {

/*

// this is an the problem solutionj of leetcode 27
    public int removeElement(int[] nums, int val) {
        int i=0;
        for (int j=0;j<nums.length;j++){
            if (val!=nums[j]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

 */

// this is an the problem solutionj of leetcode 26
    public int[] square(int [] nums){
        int [] Squear=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            Squear[i]=nums[i]*nums[i];
        }
        return Squear;
    }

public int removeDuplicates(int[] nums) {
    int i=0;
    for (int j=1;j<nums.length;j++){
        if (nums[i]!=nums[j]){
            nums[i+1]=nums[j];
            i++;
        }
    }
    return i+1;
}


    public static void main(String[]args){
        int [] nums={1,1,2,5,7,9};
        int val=2;
        removeElement_Dublicate dub=new removeElement_Dublicate();
       // System.out.print(dub.removeDuplicates(nums));
        for(int ele: dub.square(nums)){
            System.out.print(ele+" ");
        }
    }
}
