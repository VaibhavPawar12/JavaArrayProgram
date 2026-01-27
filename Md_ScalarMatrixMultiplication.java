public class Md_ScalarMatrixMultiplication {
    static void Multiplication(int A[][]){
        int smm[][] = new int[2][2];
        int k = 2;   // scalar value
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A.length; j++){            
            int num = A[i][j];
            smm[i][j] = num * k;
            System.out.print(smm[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    static void display(int A[][]){
        for (int[] x : A) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int A[][] = {{1,2},{4,5}};
        display(A);
        System.out.println();
        Multiplication(A);

    }
}
