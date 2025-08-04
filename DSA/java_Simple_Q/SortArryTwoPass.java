package DSA.java_Simple_Q;

public class SortArryTwoPass {
    public static void main(String[] args) {
        int temp = 0;
        int [] arr = {0,0,0,1,1,1,0,0,1,1,1,1,1};
        for (int i = 0 ; i< arr.length-1 ; i++){
            temp = arr[i];
            for(int j = 0 ; j< arr.length-1 ; j++){
                if(arr[j]>temp)
                    arr[j] = temp;

            }
        }

        for (int j : arr) {
            System.out.print(j);
        }
    }

}
