public class Shift_Last_First {
    static void swapLastFirst(int A[]){
        int temp = A[A.length-1];
        
        for(int i = A.length-1; i>0; i--){
            A[i] = A[i-1];
        }
        A[0] = temp;
       
    }

    static void display(int A[]){
        for(int i  = 0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        swapLastFirst(A);
        display(A);
    }
}
