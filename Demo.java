
public class Demo {
    static boolean isPresent(int n){
            while(n!=0){
                if(n%10==6){
                    return true;
                }
                n=n/10;
            }
            return false;
        }
    public static void BlackWhiteGrey(int A[]){

       
        for(int i = 0; i<A.length; i++){
            int num = A[i];
            if(num%6==0 && isPresent(num)){
                num = -3;
           }
           else if(num%6==0){
            num = -1;
           }

           else{
            num = -2;
           }

           A[i] = num;
        }       
    }

    static void display(int A[]){
        for(int x:A){
            System.out.print(x +" ");
        }
    }
    public static void main(String[] args) {
        int A[] = {15,23,18,26,72,36,49,38,60,17,22,46};
        display(A);
        System.out.println();
        BlackWhiteGrey(A);
        display(A);

    }
}
