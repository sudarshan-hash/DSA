
// Leetcode 268
//27/7/2025

import java.lang.reflect.Array;
import java.util.Arrays;

class   missingNumberProb268{
    public int missingNumber(int[] nums) {
        int missing=0;
        int sumOfArr= Arrays.stream(nums).sum(); // The sum of the main array
        int n=nums.length;
        int sumOfFullArray = (n*(n+1))/2 ; // Sum of an array with missing array
        // Subtract the main array sum by sum of a full array
        missing=sumOfFullArray-sumOfArr;
        return missing;
    }
    public static void main(String[] args) {
        missingNumberProb268 missing=new missingNumberProb268();
        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missing.missingNumber(nums));
    }
}