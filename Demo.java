public class Demo {
    // static void swapping( int arr[]) {
    //     int temp = arr[arr.length-1];
    //     for(int i = arr.length-1; i>0; i--){
    //         arr[i]=arr[i-1];
    //      }
    //      arr[0] = temp;
    // }
    static void display(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void digitfun(int arr[])
    {
        for (int i=0;i<arr.length;i++)
        {
            int temp=arr[i];
            while(temp>=10)
            {
                temp=temp/10;
            }
            arr[i]=temp;
        }
    }

     public static void main(String[] args){
         int arr[] = {123,235,6754,3257,64,2367,288,35,645,374};
         display(arr);
         digitfun(arr);
         display(arr);
         
     }
}
