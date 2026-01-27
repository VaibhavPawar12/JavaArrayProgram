public class MD_AdditionofEachRowColoumn {

    static void columnAddition(int A[][]){
        int rowsum = 0;
        int colsum = 0;
        int row = A.length;
        int col = A[0].length;
        for(int i = 0; i<row; i++){
            rowsum = 0;
            colsum = 0;
            for(int j = 0; j<A[i].length; j++){
                    rowsum+=A[i][j];
                    colsum+=A[j][i];
                    
                }
                System.out.print(rowsum + " ");
                    System.out.print(colsum+ " ");
                System.out.println();
               
            }
        }
            


        /*for(int i = 0; i<col; i++){
            for(int j = 0; j<row; j++){
                    sum1+=A[i][j];
                 
                }

            }
               System.out.print(sum1);
    }*/

    public static void main(String[] args) {
        int A[][] = 
        {{1,2,3},
        {1,2,3},
        {1,2,4}};
        columnAddition(A);

    }
    
}
