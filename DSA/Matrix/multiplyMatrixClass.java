package DSA.Matrix;

// Given two matrices mat1[][] and mat2[][] of size (4x4). Find whether the resultant res[][] matrix is equal to the multiplication of both the matrices.
 
// url = https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1
// Examples :

// Input: mat1[][]= [[1, 2, 3, 4], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]],
//  mat2[][]= [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]],
//  res[][]= [[1, 2, 3, 4], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]]
// Output: true
// Explanation: Matrices are of size 4x4 and 4x4 which results in 4x4 matrix with elements as:
// res[][] = [[1, 2, 3, 4], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]]


public class multiplyMatrixClass {
     static boolean multiplyMatrix(int mat1[][], int mat2[][], int result[][]) {
        int n = mat1.length;
        int  temp , Alsogive;
        
        for(int i = 0 ; i < n ; i++){
         for(int j = 0 ; j < n ; j++){
               temp = 0 ;
               Alsogive = result[i][j];
           for(int k  = 0 ; k < n ; k++){
          //  temp += mat1[i][j] * mat2[k][i]; by Misktake
               temp += mat1[i][k] * mat2[k][j];
           }
           if(temp != Alsogive )
               return false;
         }
        }  
        return true;
    }
    
}
