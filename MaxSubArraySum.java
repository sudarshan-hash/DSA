
//This is the max subarray sum by using
//  1)Brut Force approach
//  2) Kadane`s Algo



public class MaxSubArraySum {
    public static void main(String[] args){
        int [] array={1,2,-3,4,-5};

/* This is for printing Sub arrays
        for (int srt=0;srt<array.length;srt++){
            for(int end=srt;end<array.length;end++){
                for (int i=srt;i<=end;i++){
                    System.out.print(array[i]);
                }System.out.print(" ");
            }System.out.println();
        }
 */

 /*
        // This is an brut force approach

        int maxsum=0;
        for(int srt=0;srt<array.length;srt++){
                int cureentsum=0;
            for(int end=srt;end<array.length;end++){
                cureentsum+=array[end];
                maxsum=Math.max(cureentsum,maxsum);

            }
        }
        System.out.println("Ths max Sum is: "+maxsum);
 */

        // This is an Kadane`s Algo approach
        int sum=0;int max=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
            max=Math.max(sum,max);
            if (sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
