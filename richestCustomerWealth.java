
//Leetcode 1672
//Date 3/7/2025

public class richestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
    int wealth =0;int sum=0;
    for (int i=0;i<accounts.length;i++){
        for(int j=0;j<accounts[i].length;j++){
             sum+=accounts[i][j];
        }
        wealth=Math.max(wealth,sum);
        sum=0;
    }
    return wealth;
    }
    public static void main(String[]args){
    richestCustomerWealth find=new richestCustomerWealth();
    int [][] nums={{2,8,7},{7,1,3},{1,9,5}};
    System.out.println(find.maximumWealth(nums));
    }
}
