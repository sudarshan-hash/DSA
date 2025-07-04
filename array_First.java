
class  array_First{
   static int linear(int arr[],int target){
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==target){
                return 1;
            }
        }
        return -1;
    }
    static void swap(int arr[],int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    // Array Reversing Using Two pointer Apporch
    void reverse(int arr[]){
       int start=0;
       int end=arr.length-1;
       while (end>start){
           array_First.swap(arr,start,end);
           start++;
           end--;

       }
    }
    public static  void  main(String[] args){
       array_First c1=new array_First();

        String [] array={"Sam","Sudarshan"};
//        c1.reverse(array);
//        for (int val:array){
//            System.out.print(val);
//            System.out.print(" ");
//        }
        for (String str:array){
            System.out.println(str);
        }


    }
}