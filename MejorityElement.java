

import java.util.Vector;

public class MejorityElement {

  /*
  // This is Brute force apporch
    public int majorityElement(int[] nums) {
        int len = nums.length;
        for (int val : nums) {
            int fre = 0;
            for (int ele : nums) {
                if (ele == val) {
                    fre++;
                }
            }
            if (fre > (len/2)) {
                return val;
            }


        }
        return -1;
    }

   */
// using the Moore`s Algo


    public static void main(String[] args) {
        MejorityElement mejor = new MejorityElement();
        int[] nums = {2, 2, 2, 1, 4, 2};
      //  System.out.println(mejor.majorityElement(nums));
    }
}

