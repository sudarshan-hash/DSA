
//leetcode 1124
// Date 3/7/2025

// Not slove

public class longestWellPerformingInterval {
    int solution(int [] hours){
        int ans=0;
        int length=0;
        int nontrining=1;
        int tiring =0;
        if (hours[0]<=8 && hours[1]>8){
            nontrining=0;
            tiring=1;
        }
        for(int i=0;i<hours.length;i++){
            if (hours[i]>8){
                tiring ++;
                length++;
            }
            if (hours[i]<8){
                if (tiring>nontrining){
                    length++;
                    nontrining++;
                }
                else {
                     length=0;
                     tiring=0;
                     nontrining=1;
                }
            }
            ans=Math.max(ans ,length);
        }
        return ans;
    }

    public static void main(String[] args){
        longestWellPerformingInterval length=new longestWellPerformingInterval();
        int [] nums={6,6,6,6};
        System.out.println(length.solution(nums));
    }

}
