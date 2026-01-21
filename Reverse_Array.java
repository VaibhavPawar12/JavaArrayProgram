public class Reverse_Array {
    static void ArrayReverse(int A[]){
        for(int i = 0 , j = A.length-1; i<j; i++,j--){
            A[i] = A[i]+A[j];
            A[j] = A[i]-A[j];
            A[i] = A[i]-A[j];
        }
    }
    static void Display(int A[]){
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);       
        }
    }
    public static void main(String args[]){
        int A[] = {1,2,3,4,5};
        ArrayReverse(A);
        Display(A);
    }
}
