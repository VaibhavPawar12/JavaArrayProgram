public class Swap_First_Last {
    static void swapFirstLast(int A[]){
        for(int i = 1; i<A.length-1; i++){
        }
        A[0] = A[0] + A[A.length-1];
        A[A.length-1] = A[0] - A[A.length-1];
        A[0] = A[0] - A[A.length-1];
    }

    static void displaySwap(int A[]){
        for(int i = 0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        swapFirstLast(A);
        displaySwap(A);
    }
}
