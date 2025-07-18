package Problems;

// leetcode 75
// 18/7/2025

public class problem75 {
    private static void swap (int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int index=0;
        for(int i=0;i<=2;i++){
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    swap(nums,index,j);
                    index++;
                }
            }
        }
    }
    public static void main(String[] args) {
        problem75 obj = new problem75();
        int[] arr = {2,0,2,1,1,0};
        obj.sortColors(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
