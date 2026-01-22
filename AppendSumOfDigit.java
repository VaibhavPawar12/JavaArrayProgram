public class AppendSumOfDigit {
    static void AppendSum(int A[]){
        for(int i = 0; i<A.length; i++){
            int sum = 0;
            int cnt1 = 0;
            int num = A[i];

            while(num>0){
                int last = num % 10;
                sum+=last;
                num = num / 10;
            }
            int temp = sum;

            while (temp!=0) {
                temp = temp / 10;
                cnt1++;          
            }

            int res = (int)Math.pow(10,cnt1);
            A[i] = A[i] * res + sum;
            System.out.println(A[i]);
        }
    }
    public static void main(String[] args) {
        int A[] = {123,235,6754,3257,64,2367,288,35,645,374};
        AppendSum(A);
    }
}
