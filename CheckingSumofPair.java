public class CheckingSumofPair {
    static void checkSum(int A[]){
        int sum = 66;
        for(int i=0; i<A.length-2; i++){
            for(int j =i+1; j<A.length-1; j++ ){
                for(int k = j+1; k<A.length; k++){
                    if(sum==A[i]+A[j]+A[k]){
                    System.out.println(A[i] + " " +A[j] + " " +A[k]);
                    }
                }
            }
            
        }
    }
    public static void main(String[] args) {
        int A[] = {11,22, 33,44,55,66,77,88,99,100,101,102,103};
        checkSum(A);
    }
}
