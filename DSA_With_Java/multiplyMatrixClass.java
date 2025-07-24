package DSA_With_Java;

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
