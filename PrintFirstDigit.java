public class PrintFirstDigit {
    static void printDigit(int A[]){
        for(int i = 0; i<A.length; i++){
            int num = A[i];
            while(num>=10){
                num=num/10;
            }
            System.out.println(num);     
        }       
    }
    

    public static void main(String[] args) {
        int A[] = {100,200,300,400,500};
        printDigit(A);
    }
}
