class Simple_Problems_Array{
    static void forwardBackwardDisplay(){
        //Forward
        int arr[] = {1 ,2 , 3, 4, 5};
        for(int i =  0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        //Backward
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void sumOfArrayEle(){
        int sum = 0;
        int arr[] = {1 ,2 , 3, 4, 5};
        for(int i =  0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum Of Array :"+sum);
    }

    static void AvgOfArrayEle(){
        int sum = 0;
        int arr[] = {1 ,2 , 3, 4, 5};
        for(int i =  0; i<arr.length; i++){
            sum+=arr[i];
        }

        int avg = sum / arr.length;
        System.out.println("Average Of Array :"+avg);
    }

    static void sumOfOddArray(){
        int sum = 0;
        int arr[] = {1 ,2 , 3, 4, 5};
        for(int i =  0; i<arr.length; i++){
            if(arr[i]%2!=0){
               sum+=arr[i];
            }
        }
        System.out.println("Sum Of Odd Nums :"+sum);
    }

    static void AvgOfOddEvenArr(){
        int sum = 0;
        int temp = sum;
        int cnt = 0;

        int arr[] = {1 ,2 , 3, 4, 5};
        for(int i =  0; i<arr.length; i++){
            if(arr[i]%2!=0){
               sum+=arr[i];
               cnt++;
            }
            else{
                temp+=arr[i];
            }
        }
        int avg = sum/ cnt;
        System.out.println("Average of Odd Nums :"+avg);
        int avg1 = temp / cnt;
        System.out.println("Average of Even Nums :"+avg1);
    }
    
    public static void main(String[] args) {
        forwardBackwardDisplay();
        sumOfArrayEle();
        AvgOfArrayEle();
        sumOfOddArray();
        AvgOfOddEvenArr();
    }
}