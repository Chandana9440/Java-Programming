class Main{
    public void Display(){
        int[][] matrixA={{1,3,4},{7,6,5}};
        for (int i=0 ; i<matrixA.length ; i++){
            for (int j=0; j<matrixA[i].length; j++){
                System.out.print(matrixA[i][j] + " ");
            }
        System.out.println();
        }
        for (int a=0 ; a<matrixA[0].length ; a++){
            for (int b=0; b<matrixA.length; b++){
                System.out.print( matrixA[b][a] + " ");
            }
        System.out.println();
        }
    }
}
public class Transpose {
    public static void main(String[] args) {
        Main obj1= new Main();
        obj1.Display();
    }
    
}

