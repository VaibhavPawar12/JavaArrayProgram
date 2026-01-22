public class Demo {

    static void ReplaceFirstLast(int A[]){
        for(int i = 0; i<A.length; i++){
            //Calculate Multipler
            int y = (int)Math.log10(A[i]);
            int multipler = (int)Math.pow(10,y);
            A[i] = A[i] % multipler * 10 + A[i] / multipler;
        }
    }

    static void display(int A[]){
        for(int x:A){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int A[] = {123,235,6754,3257,64,2367,288,35,645,374};
        ReplaceFirstLast(A);
        display(A);
    }
}