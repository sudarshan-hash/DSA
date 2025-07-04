

// This is an example of the Product of Array Except Self
//Leetcode=238


import java.util.Vector;

public class ProductofArrayExceptSelf {

/*
// Brut Force approach
    public int[] productExceptSelf(int[] nums) {
        int[] arrproduct=new int[nums.length];

        for(int i=0; i<nums.length;i++){
            int product=1;
            for (int j=0;j<nums.length;j++){
                if (i==j){
                    continue;
                }
                else {
                    product=product*nums[j];
                }
            }
            arrproduct[i]=product;
        }
        return  arrproduct;
    }
 */

//Optimal Approach  using suffix and prefix array mul
    public int[] productExceptSelf(int[] nums) {
        int[] arrproduct=new int[nums.length];
        // So creat two  Vector for Prefix and suffix
        Vector<Integer> prefix=new Vector<>(nums.length,1);
        Vector<Integer> suffix=new Vector<>(nums.length,1);

        // initializing the prefix and suffix to 1
        prefix.add(0,1);
        suffix.add(nums.length-1,1);

        // loop for calculating prefix
        for(int i=2;i<nums.length;i++){
            prefix.add(i,prefix.get(i-1)*nums[i-1]);
        }
        //loop for calculating suffix
        for (int i=nums.length-2;i>=0;i--){
            suffix.add(i,nums[i+1]*suffix.get(i+1));
        }

        for (int i=0;i<nums.length;i++){
            arrproduct[i]=prefix.get(i)*suffix.get(i);
        }

        return  arrproduct;
    }

    public static void main(String[] args){
        ProductofArrayExceptSelf obj=new ProductofArrayExceptSelf();
        int nums[]={1,2,3,4};
        for (int val: obj.productExceptSelf(nums)){
            System.out.print(val+" ");
        }

    }
}
