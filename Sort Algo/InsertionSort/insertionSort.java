package InsertionSort;

public class insertionSort {

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i -1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        insertionSort obj = new insertionSort();
        int[] arr = {12, 11, 13, 5, 6};
        int n = arr.length;
        obj.insertionSort(arr, n);
        System.out.println("Sorted array:");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
