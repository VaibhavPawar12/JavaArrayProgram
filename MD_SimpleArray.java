import java.util.Scanner;
public class MD_SimpleArray {

    static void display(int A[][]){
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print(i +" "+ j + " " + A[i][j]+ "    ");
            }
            System.out.println();        
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            System.out.print("Enter  11");
            for (int j = 0; j < A.length; j++) {
                A[i][j] = sc.nextInt();

            }
            System.out.println();        
        }
        display(A);
    }
}
