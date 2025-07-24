package DSA.Matrix;

import java.util.ArrayList;

// You are given a square matrix of size n x n. Your task is to find the transpose of the given matrix.
// The transpose of a matrix is obtained by converting all the rows to columns and all the columns to rows.
// url = https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1
// Examples :

// Input: mat[][] = [[1, 1, 1, 1],
//                 [2, 2, 2, 2],
//                 [3, 3, 3, 3],
//                 [4, 4, 4, 4]]
// Output: [[1, 2, 3, 4],
//        [1, 2, 3, 4],
//        [1, 2, 3, 4],
//        [1, 2, 3, 4]]
// Explanation: Converting rows into columns and columns into rows.


public class transposeClass {
    
     public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
      int n = mat.length;
        
        for(int i =0 ; i<n ; i++){
         for(int j = i+1 ; j<n ; j++){
             if(i==j)
             continue;
             else{
             int temp   = mat[i][j];
             mat[i][j] = mat[j][i];
             mat[j][i] = temp;
         }
            
        }
    }
    ArrayList<ArrayList<Integer>> result = new  ArrayList();
    
    for(int i=0; i<n; i++) {
    ArrayList<Integer> row = new ArrayList<>();
    for(int j=0; j<n; j++) {
        row.add(mat[i][j]);
    }
    result.add(row);
}
    return result;
} 
}
