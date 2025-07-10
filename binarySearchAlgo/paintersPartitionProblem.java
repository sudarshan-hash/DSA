package binarySearchAlgo;

// IMP problem
// 10/7/2025
// Same Approach of Book Allocation Problem

import java.lang.reflect.Array;
import java.util.Arrays;

public class paintersPartitionProblem {
    private static int sumOfPages(int [] paints){
        int sum=0;
        for (int i=0;i<paints.length;i++){
            sum=sum+paints[i];
        }
        return sum;
    }
    private boolean isValid(int[] paints , int painters, int maxTimeLimit ){
        int painter=1;
        int Totaltime=0;
        for (int time : paints){
            if (time>maxTimeLimit){
                return false;
            }
            if (Totaltime+time<=maxTimeLimit){
                Totaltime+=time;
            }
            else {
                painter++;
                Totaltime=time;
            }
        }
        return  painter > painters ? false : true; 
    }
    public int Solution(int[] paints , int painters){
        if(painters>paints.length){
            return -1;
        }

        int srt= Arrays.stream(paints).min().getAsInt();
        int end=sumOfPages(paints);
        int mid=0;
        int ans=-1;
        while (srt<=end){
            mid=srt+(end-srt)/2;
            // for Valid
            if (isValid(paints,painters,mid)){
                //to left
                end=mid-1;
                ans=mid;
            }
            else{
                //to right
                srt=mid+1;
            }

        }


        return ans;
    }

    public static void  main(String[] args){
        paintersPartitionProblem time=new paintersPartitionProblem();
        int[] paints={10,20,30,40};
        System.out.println(time.Solution(paints,2));
    }
}
