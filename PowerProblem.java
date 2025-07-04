
// Power Exponential Problem leetcode-50


import java.util.Vector;

public class PowerProblem {
    public double myPow(double x, int n) {
        if(n==0){ return 1.0; }
        if(x==0){ return 0.0; }
        if(x==1){ return 1.0; }
        if(x==-1&&n%2==0){return 1.0;}
        if(x==-1&&n%2!=0){return -1.0;}

        double ans=1;
        long binform=n;
        if(n<0){
            // This if for nigative power n;
            //  2^-2 = 1/2^2 = 1/4 = 0.25
            x=1/x;
            binform=-binform;
        }

        while(binform>0){
            if(binform%2==1){
                ans*=x;
            }
            x=x*x;
            binform/=2;
        }

        return ans ;
    }
    public static void main(String[]args){
        PowerProblem ans=new PowerProblem();
        System.out.println(ans.myPow(2,-2));

    }
}
