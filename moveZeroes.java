
// Move Zeroes Problem leetcode 283
//  Apply Operations to an Array leetcode 2460

/*
Note
In this example i solve two problem because leetcode problem 2460 required method is moves zero .
 */


//optimla solution O(n)
public class moveZeroes {
    public static void swap(int[] nums,int first,int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    //Leetcode 283
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        int n=nums.length;
        while  (j<n){
            if(nums[i]!=0){
                i++;
                j++;
            }
            else if (nums[j]==0){
                j++;
             //   i++;
            }
            else if (nums[i]==0){
               moveZeroes.swap(nums,i,j);
                i++;
                j++;
            }

        }

    }
    //Leetcode 2460
    public void applyOperations(int[] nums){
        int i=0;

        while (i<nums.length-1){
            if (nums[i]==nums[i+1]) {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
                i++;
            }
            else {
                i++;
            }
        }
    }
    public static void main(String[]args){
        int[] nums={1,2,2,1,1,0};
        moveZeroes move =new moveZeroes();
        move.applyOperations(nums);
        move.moveZeroes(nums);
      //  moveZeroes.swap(nums,1,2);
        for(int val : nums){
            System.out.print(val+" ");
        }

    }
}
