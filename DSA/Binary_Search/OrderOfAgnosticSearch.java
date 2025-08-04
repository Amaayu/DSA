package DSA.Binary_Search;

public class OrderOfAgnosticSearch {

    static  public  int searchTargetDescendOder(int nums[] ,int key){
        // Descend :- 8,7,6,5,4,3,2,1
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
    static  public  int searchTargetAscendOrder(int nums[] ,int key){
        // Ascend :- 1,2,3,4,5,6,7
        int left = 0 ;
        int right = nums.length - 1;

        while (left<=right){

            int mid = left + ( right - left) /2;

            if (nums[mid] == key)
                return mid;
            else if (nums[mid]>key)
                right = mid - 1;
            else
                left = mid + 1;

        }

        return -1;
    }

    static public int AgnosticSearch(int [] nums , int k){
        if(nums[0]<nums[1])
          return  searchTargetAscendOrder( nums , k) ;
        else return searchTargetDescendOder( nums , k) ;
    }

    public static void main(String[] args) {

       // Descend int [] array = {8, 7, 6, 5, 4, 3, 2, 1};
         int[] array = { 1,2,3,4,5,6,7,8};
        int key = 7;
        System.out.println( AgnosticSearch(array,key)
        );

    }

}
