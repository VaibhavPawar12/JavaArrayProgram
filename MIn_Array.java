

public class MIn_Array {
    static int minDigit(int A[]){
        int min = A[0];
        for(int i = 1; i<A.length; i++){
            if(min>A[i]){
                min = A[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int res = minDigit(A);
        System.out.println(res);
    }

}
