public class Shift_First_Last {
    static void swapFirstLast(int A[]){
        int temp = A[0];
        for(int i = 0; i<A.length-1; i++){
            A[i] = A[i+1];
        }
        A[A.length-1] = temp;
    }

    static void display(int A[]){
        for(int i  = 0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        swapFirstLast(A);
        display(A);
    }
}
