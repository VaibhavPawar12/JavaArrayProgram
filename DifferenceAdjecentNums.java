public class DifferenceAdjecentNums {
    static void Difference(int A[]){
        for(int i = 0; i<A.length-1; i++){
            int Diff;
               if(A[i]>A[i+1]){
                Diff = A[i] - A[i+1];             
               }
            
               else{
                  Diff = A[i+1] - A[i];
               }

               A[i] = Diff;
            
            System.out.print(A[i] + "  ");
        }
    }
    public static void main(String[] args) {
        int A[] = {15, 23, 18, 26, 72, 36, 49, 38, 60, 17, 22, 46};
        Difference(A);
    }
}
