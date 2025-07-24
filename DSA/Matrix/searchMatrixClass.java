package DSA.Matrix;

// Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
// Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.
 // url = https://www.geeksforgeeks.org/problems/search-in-a-matrix-1587115621/1
// Examples:

// Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
// Output: true
// Explanation: 14 is present in the matrix, so output is true.
// Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
// Output: false
// Explanation: 42 is not present in the matrix.
public class searchMatrixClass {

    public boolean searchMatrix(int[][] mat, int x) {
        int r = mat.length;
        int c = mat[0].length;
        
        int i = 0, j = c - 1;  // top-right se start
        
        while(i < r && j >= 0) {
            if(mat[i][j] == x) {
                return true;
            } else if(x < mat[i][j]) {
                j--;  // left shift
            } else {
                i++;  // move down
            }
        }
        
        return false;  // not found
    }
    
}
