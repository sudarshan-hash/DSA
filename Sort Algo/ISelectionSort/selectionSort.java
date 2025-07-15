package ISelectionSort;

public class selectionSort {

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void selectionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int MinIndex=i;
            for (int j=i+1;j<n;j++){
                if(arr[j]<=arr[MinIndex]){
                    MinIndex=j;
                }
            }
            swap(arr,i,MinIndex);
        }
    }
    public void display(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        selectionSort obj = new selectionSort();
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;
        obj.selectionSort(arr, n);
        System.out.println("Sorted array:");
        obj.display(arr);
    }
}
