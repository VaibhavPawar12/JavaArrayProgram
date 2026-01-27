import java.util.Scanner;

public class MD_MatrixAddition {
    static void Addition(int A[][] , int B[][] ,int C[][]){
        for (int i = 0; i < A.length; i++) {
            for(int j = 0; j<A.length; j++){
                System.out.print(A[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            for(int j = 0; j<B.length; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i<C.length; i++){
            for(int j = 0; j<C.length; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            System.out.print("Enter  A");
            for (int j = 0; j < A.length; j++) {
                A[i][j] = sc.nextInt();

            }
            System.out.println();        
        }
        int B[][] = new int[3][3];
        for (int i = 0; i < B.length; i++) {
            System.out.print("Enter  B");
            for (int j = 0; j < A.length; j++) {
                B[i][j] = sc.nextInt();

            }
            System.out.println();        
        }

        int C[][] = new int[3][3];
        Addition(A,B,C);
    }
}
