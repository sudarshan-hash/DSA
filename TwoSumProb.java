
import java.util.*;


public class TwoSumProb {


/*
// This is brout force apporch for this sum
    public Vector<Integer> Twosum( int[] nums,int target){
        Vector<Integer> Index=new Vector<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int y=target-x;
            for(int j=0;j<nums.length;j++){
                if (nums[j]==y & i!=j ){
                    Index.add(i);
                    Index.add(j);
                    return Index;
                }
            }
        }
        return  Index;
 */
/*
// So the array is sorted then take advantaged of this
// Using two pointer apporch like in reverse an array

    public int[] sum(int nums[], int target) {
        int[] index=new int[2];
        int start=0;
        int end=nums.length-1;
        while (start<end){
            int sum=nums[start]+nums[end];
            if (sum<target){
                start++;
            }
            else if (sum>target){
                end--;
            }
            else if (sum==target){
                index[0]=start;
                index[1]=end;
                return index;
            }
        }
        return index;
    }
 */

    public static void main(String[]args) {
        TwoSumProb two = new TwoSumProb();
        int nums[] = {0, 1, 3, 3, 4, 5};
        int target = 6;
    }

}
