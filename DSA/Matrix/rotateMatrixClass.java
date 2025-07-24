package DSA.Matrix;

// Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 
// url = https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1
// Examples:

// Input: mat[][] =[[0, 1, 2], 
//                 [3, 4, 5], 
//                [6, 7, 8]] 
// Output: [[2, 5, 8],
//         [1, 4, 7],
//         [0, 3, 6]]

public class rotateMatrixClass {

    public void rotateMatrix(int[][] mat) {
        int n = mat.length;
        int adv = n - 1;

        // transpose
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // vertical flip
        for(int i = 0; i < n/2; i++){
            for(int j = 0; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[adv - i][j];
                mat[adv - i][j] = temp;
            }
        }

       
}
    
}
