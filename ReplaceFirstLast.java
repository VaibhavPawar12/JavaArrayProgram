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

    //Shortcut method
    /*static void ReplaceFirstLast(int A[]){
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
    }*/

    public static void main(String[] args) {
        int A[] = {101,202,303,404,505};
        printDigit(A);
        //display(A);
    }
}
