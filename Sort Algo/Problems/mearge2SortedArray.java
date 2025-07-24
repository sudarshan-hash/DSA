package Problems;

public class mearge2SortedArray {
    public void mearge(int[] arr1,int m,int[] arr2,int n){
        int i=m-1,j=n-1,inx=m+n-1;
        while (i>=0&&j>=0){
            if (arr1[i]>=arr2[j]){
                arr1[inx]=arr1[i];
                i--;
                inx--;
            }
            else{
                arr1[inx]=arr2[j];
                inx--;
                j--;
            }
        }
        while (j>=0){
            arr1[inx--]=arr2[j--];
        }
    }
    public static void main(String[] args) {
        mearge2SortedArray mearge=new mearge2SortedArray();
        int[] arr1={1,2,3,0,0,0};
        int m= 3;
        int[] arr2={2,5,6};
        int n= 3;
        mearge.mearge(arr1,m,arr2,n);
        for (int val:arr1){
            System.out.print(val);
        }
    }
}
