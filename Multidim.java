class Matrixmul {
    public void Display() {
        int[][][] matrixA = {{{1, 2, 3}},
                             {{4, 5, 6}}};

        // Loop through the first dimension (2)
        for (int i = 0; i < matrixA.length; i++) {
            // Loop through the second dimension (1)
            for (int j = 0; j < matrixA[i].length; j++) {
                // Loop through the third dimension (3)
                for (int k = 0; k < matrixA[i][j].length; k++) {
                    System.out.print(matrixA[i][j][k] + " ");
                }
                System.out.println(); // Print a new line after each sub-array
            }
        }
    }
}

 class Multidim {
    public static void main(String[] args) {
        Matrixmul obj1 = new Matrixmul();
        obj1.Display();
    }
}