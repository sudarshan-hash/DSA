
// This is an example of the Container with Water Problem
//Return the max amount of water that Container can store.
//Leetcode=11


public class ConMostWaterProb {

 /*
//Brut Force approach   ( Using of subarray Brut Force approach teq)
    public int maxArea(int [] nums){
        int area=1;
        int width=0;
        for(int srt=0;srt<nums.length;srt++){
            int cureentarea=0;
            for(int end=srt;end<nums.length;end++){
                cureentarea=Math.min(nums[srt],nums[end])*width; // Here it can also be the width=end-srt;
                area=Math.max(cureentarea,area);
                width++;
            }
            width=0;
        }
        return area;
    }

 */

// Optimal Approach  (2 Pointer approach)
    public int maxArea(int[] height) {
        int lp=0;  //left pointer index
        int rp=height.length-1;//right pointer  index
        int width=0;   // width of con
        int ht=0;      // Height of con
        int ans=0;      // main ans means max water count

        while (lp<rp){
            width=rp-lp;
            ht=Math.min(height[lp],height[rp]);
            int Area=width*ht;
            ans=Math.max(ans,Area);
            if (height[lp]<height[rp]){
                lp++;
            }
            else {
                rp--;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        ConMostWaterProb obj=new ConMostWaterProb();
        int[] height={1,8,6,2,5,4,8,3,7};
//       System.out.println(obj.maxWater(nums));
        System.out.println("The Max Water Stored in Container is: "+obj.maxArea(height));

    }

}
