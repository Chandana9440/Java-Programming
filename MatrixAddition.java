class Matrix {
    public void Addition(){
    int[][] matrix1= {{2,3,4},{6,7,9}};
    int[][] matrix2={{3,5,6},{8,1,5}};
    for(int i=0; i<matrix1.length; i++){
        for(int j=0; j<matrix1[i].length; j++){
            int x= matrix1[i][j]+matrix2[i][j];
            System.out.print(x+" ");
        }
        System.out.println();
    } 
    }
}
public class MatrixAddition {
    public static void main(String[] args){
        Matrix obj1=new Matrix();
        obj1.Addition();


    }
}

