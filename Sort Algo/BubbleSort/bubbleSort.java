package BubbleSort;

// 14/7/2025


public class bubbleSort {
    
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public void BubbleSort(int[] arr,int n){
        for (int i=0;i<n-1;i++){
            boolean isSwapped = false; // Check point for an array is already sorted
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    isSwapped = true;
                }
            }
            if (!isSwapped){ return;}
        }
    }

    public void display(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        bubbleSort obj = new bubbleSort();
        int[] arr={1,2,4,3,5};
        obj.BubbleSort(arr,arr.length);
        obj.display(arr);
        System.out.println();
    }
}