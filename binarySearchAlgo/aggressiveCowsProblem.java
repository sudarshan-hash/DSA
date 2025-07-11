package binarySearchAlgo;

// Same approach like Painters and Book Allocation problem
// To slove this problem required Sort algo
// 11/7/2025

import java.util.Arrays;
import java.util.Optional;

public class aggressiveCowsProblem {

    private static boolean isvalid(int [] stalls,int N,int cows,int minAllowedDis){
        int cow=1;
        int stall=stalls[0];
        for (int i=0;i<N;i++){
            if (stalls[i]>=minAllowedDis){
                cow++;
                stall=stalls[i];
            }
            if (cow==cows){
                return true;
            }
        }
        return false;
    }

    public int Solution(int [] stalls,int N,int cows){
        Arrays.sort(stalls);
        if (cows>N){
            return -1;
        }
        int srt=1;                // Min
        int end=(N-1)-stalls[0]; //max
        int mid;
        int ans=-1;

        while (srt<=end){
            mid=srt+(end-srt)/2;
            if(isvalid(stalls,N,cows,mid)){
                // To right
                ans=mid;
                srt=mid+1;
            }
            else {
                // To left
                end=mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args){
    aggressiveCowsProblem solution=new aggressiveCowsProblem();
    int[] stalls={1,2,8,4,9};
    int N=stalls.length;
    int cows=3;
    System.out.println(solution.Solution(stalls,N,cows));
    }
}
