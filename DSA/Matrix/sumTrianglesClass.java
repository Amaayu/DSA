package DSA.Matrix;

import java.util.ArrayList;

//url = https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1

// Given a square matrix of size N*N, print the sum of upper and lower triangular elements. Upper Triangle consists of elements on the diagonal and above it. The lower triangle consists of elements on the diagonal and below it. 

// Example 1:

// Input:
// N = 3 
// mat[][] = {{6, 5, 4},
//            {1, 2, 5}
//            {7, 9, 7}}
// Output: 
// 29 32
// Explanation:
// The given matrix is
// 6 5 4
// 1 2 5
// 7 9 7
// The elements of upper triangle are
// 6 5 4
//   2 5
//     7
// Sum of these elements is 6+5+4+2+5+7=29.
// The elements of lower triangle are
// 6
// 1 2
// 7 9 7
// Sum of these elements is 6+1+2+7+9+7= 32.

public class sumTrianglesClass {

     // Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        int upperSum = 0;  int lowerSum = 0;
      
      for(int i = 0 ; i < n ; i++){
         for(int j = 0 ; j < n ; j++){
             
            if(i==j){
               upperSum+= matrix[i][j];
               lowerSum+= matrix[i][j];
            }
             else if(i>j)
              lowerSum+= matrix[i][j];
              
             else upperSum+= matrix[i][j];

         }
      }
      
       
      
    ArrayList<Integer> result = new ArrayList<>();
    result.add(upperSum);
    result.add(lowerSum);
    return result;

        
    }
    
}
