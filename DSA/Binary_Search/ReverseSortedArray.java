package DSA.Binary_Search;

public class ReverseSortedArray {

 static  public  int searchTarget(int nums[] ,int key){
     int left = 0 ;
     int right = nums.length - 1;

     while (left<=right){

         int mid = left + ( right - left) /2;

         if (nums[mid] == key)
             return mid;
         else if (nums[mid]>key)
             left = mid + 1;
         else
             right = mid - 1;

     }

     return -1;
 }

    public static void main(String[] args) {
     int [] array = {8, 7, 6, 5, 4, 3, 2, 1};
     int key = 7;
        System.out.println(searchTarget(array , key)
        );

    }
}
