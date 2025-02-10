class Main{
    public void Display(){
        int[][] matrixA = {{1,2,3},{4,5,6}};
        int sum=0;
        int sum1=0;
        for(int i=0; i<matrixA.length; i++){
            for(int j=0; j<matrixA[0].length; j++){
                sum += matrixA[i][j];
            }
            System.out.print(sum+ " ");
            sum=0;
            System.out.println();
        }
       
        for(int a=0; a<matrixA[0].length; a++){
            for(int b=0; b<matrixA.length; b++){
                sum1 += matrixA[b][a];
            }
            System.out.print(sum1 + " ");
            sum1=0;
        }
    }
}

public class RowColSum {
    public static void main(String[] args) {
        Main obj1= new Main();
        obj1.Display();

    }
    
}
