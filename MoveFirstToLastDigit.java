public class MoveFirstToLastDigit {
    static void MoveFirstLast(int A[]){
        for(int i = 0; i<A.length; i++){
            int first = A[i];
            int temp = A[i];
            int last;
            int res = 0;
            int cnt = 0;

            while(first>=10){
                first = first/10;
            }
            // System.out.println(first);

            while(temp>=10){
                last = temp % 10;
                res = res + last *( (int)Math.pow(10, cnt));
                cnt++;
                temp = temp/10;
            }
            int finalRes=res*10+first;
            System.out.println(finalRes);           
        }
    }
    public static void main(String[] args) {
        int A[] = {123,456,789,156,453};
        MoveFirstLast(A);
    }
}
