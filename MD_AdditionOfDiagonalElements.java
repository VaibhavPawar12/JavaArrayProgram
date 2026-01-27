/*public class MD_AdditionOfDiagonalElements {

    static void Addition(int A[][]) {
        int sum = 0;
        System.out.print("Diagonal Elements: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i][i] + " ");
        }


        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i][i];   // diagonal element
        }

        System.out.println("Sum of Diagonal Elements = " + sum);
    }

    public static void main(String[] args) {
        int A[][] = {{1, 2, 1}, {1, 2, 3},{4,2,3}};
        Addition(A);
    }
}*/

public class MD_AdditionOfDiagonalElements {
    static void mainAddition(int A[][]){
        int sum = 0;
        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A.length; j++){
                
                if(i==j){
                    sum+=A[i][j];
                    System.out.print(A[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(sum);
    }

    static void minorAdditon(int A[][]){
         int sum1 = 0;
         int n = A.length;
        for(int i = 0; i<n; i++){
                int j = n-1-i;
                    sum1+=A[i][j];
                    System.out.print(A[i][j] + " ");
            System.out.println();
        }
        System.out.println(sum1);
    }
    public static void main(String[] args) {
        int A[][] = {{1,2,3},{1,2,3},{1,2,3}};
        mainAddition(A);
        minorAdditon(A);
    }
}


