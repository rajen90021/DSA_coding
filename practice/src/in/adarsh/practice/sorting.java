package in.adarsh.practice;

public class sorting {
public static void printarry(int[] arr){
    for(int i=0;i< arr.length;i++){
        System.out.print(" "+arr[i]);
    }
}
    public static void bubblesort(int[] arr){

        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarry(arr);


    }
    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2};
        bubblesort(arr);
    }
}
