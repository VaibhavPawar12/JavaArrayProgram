public class MD_CheckMatrixEqualOrNot {

    static boolean isEqual(int A[][] , int B[][]){
        if(A.length!=B.length){
            return false;
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i].length!=B[i].length){
                return false;
            }
        }
        

        for (int i = 0; i < A.length; i++) {
            for(int j = 0; j<A.length; j++){
                if(A[i][j]!=B[i][j]){
                    return false;
                }
            }
        }
    
        return true;
    }

    public static void main(String[] args) {
        int A[][] = {{1,2},{1,2}};
        int B[][] = {{1,2},{1,2}};
        boolean check = isEqual(A, B);
        System.out.println("Array A == Array B :" + check);

    }
}