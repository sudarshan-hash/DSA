

// This is for Vector Data types A Vector is a dynamic array-like data structure provided by Java
// in the java.util package. Unlike regular arrays, Vectors can grow or shrink in size automatically
// when elements are added or removed.

//import java.util.*;
import java.util.Vector;
import java.util.ArrayList;

public class vector  {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        int j = 0;

        for (int i =1; i <nums.length; i++,j++) {
            int x = nums[j];
            int y = target-x;
            if (y == nums[i]) {
                array[0] = j;
                array[1] = i;
                break;
            }


        }
        return  array;
    }
    public static void main(String [] args) {

          Vector<Integer> vec = vec= new Vector<>(1,5);
          ArrayList<Integer> arrayList=new ArrayList<>();
          vector obj1=new vector();



//        int [] array=new int[10];
//        vec.add(0,2);
//        vec.add(1,2);
//        vec.add(2,1);
//        vec.addLast(3);
//        vec.addLast(1);
//        vec.sort(null);
//        // Finding uniqu value
//        int unique=0;
//        for(int val : vec){
//            unique=unique^val;
//        }
//       System.out.println("The Unique is the "+unique);
     //   vector vec = new vector();
//        int[] arr = {2,7,11,15};
//        for (int val:vec.twoSum(arr, 9)){
//            System.out.print(val);
//        }
    //nums = [1,0,1,1,0,1]
        int [] nums ={1,1,1,0,1,1,1,1,1,1,0,1,1,1,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1};
        int count=0;
        int maxcount=0;
        int x=nums[0];
        int i=0;
        for (int val : nums){

            if (val==x){
                count++;
                if (count>maxcount){
                    maxcount=count;
                }
            }else {
                count=0;
               x=nums[i];
            }
            i++;
        }
       // System.out.println("The max count of 1 is "+maxcount);

    }

}
