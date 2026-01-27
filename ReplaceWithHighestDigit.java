public class ReplaceWithHighestDigit {

    static void ReplaceDigit(int A[]){
        for(int i = 0; i<A.length; i++){
            int num = A[i];
            int prev = 0;
            int highestDigit = 0;

            while(num!=0){

                int last = num%10;
                if (last>highestDigit){
                    highestDigit=last;
                }
                num = num / 10;

            }
            A[i] = highestDigit;
            System.out.println(A[i]);
        }
    }
    public static void main(String[] args) {
        int A[] = {123,235,6754,3257,64,2367,288,35,645,374,56};
        ReplaceDigit(A);

    }
}