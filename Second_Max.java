public class Second_Max {
    static void SecondLarge(int A[]){
        int max = A[0];
        int second_max = A[0];
        int third_max = A[0];
        boolean isFound = false;

        for(int i = 0; i<A.length; i++){
            if(max<=A[i]){
                max = A[i];
            }
        }     
        for(int i = 0; i<A.length; i++){
            if(A[i] < max){
                if (A[i]>second_max) {
                    second_max = A[i];
                }
                
            }  
        }
        for(int i = 0; i<A.length; i++){
            if(A[i] < max){
                if (A[i]<second_max) {
                    if(A[i]>third_max){
                        third_max = A[i];
                    }
                }
                
            }  
        }     
        System.out.println(max + " " + second_max + " " + third_max);
    }

    public static void main(String[] args) {
        int A[] = {15, 72, 48, 96, 33, 81};
        SecondLarge(A);
    }
}
