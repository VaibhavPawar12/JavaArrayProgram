public class ReveseDigitOfArray {
    static void ReverseArray(int A[]){
        for(int i = 0; i<A.length; i++){
            int rev = 0;
            int num = A[i];

            while(num!=0){
                int last = num %  10;

                rev = rev * 10 + last;

                num = num / 10;
            }

            A[i] = rev;
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        int A[] = {123,235,6754,3257,64,2367,288,35,645,374,56};
        ReverseArray(A);
    }
}
