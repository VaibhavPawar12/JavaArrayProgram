public class ReplaceFirstLast {
    static void  printDigit(int A[]){
        
        for(int i = 0; i<A.length; i++){
            
            int num=A[i];
            int last = num%10;
            while(num>=10){
                num=num/10;
                  
            }
            A[i]=num*10+last;
            System.out.println(A[i]);
               
        }    
    }
    /*static void display(int A[]){
        for(int i = 0; i<A.length; i++){
            System.out.println(A[i]);
        }
    }*/

    public static void main(String[] args) {
        int A[] = {101,202,303,404,505};
        printDigit(A);
        //display(A);
    }
}
