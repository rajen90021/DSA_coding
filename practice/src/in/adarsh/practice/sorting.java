package in.adarsh.practice;

public class sorting {
public static void printarry(int[] arr){
    for(int i=0;i< arr.length;i++){
        System.out.print(" "+arr[i]);
    }
}
    public static void bubblesort(int[] arr){

        for(int i=0;i< arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printarry(arr);


    }
    public static  void  selectionsort(int[] arr){


    for(int i=0;i< arr.length;i++){

        for(int j=i;j<arr.length;j++){

            if(arr[i]>arr[j]){
                int temp= arr[i];
                arr[i] =arr[j];
                arr[j]=temp;
            }
        }
    }
    printarry(arr);
    }
    public static void moverightzero(int[] arr ){
///5,3,42,0,0 output
         for(int i=0;i<arr.length-1;i++){

             for(int j=0;j<arr.length-i-1;j++){

                 if(arr[j]==0 && arr[j+1] !=0 ){
                     int temp= arr[j];
                     arr[j] =arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }
         printarry(arr);
    }
    public static void merge(int[] arr, int l ,int mid ,int h){

    int i,j,k;
    int[] ans= new int[arr.length];
    i=l; j=mid+1;k=l;

    while(i<=mid && j<=h){
        if(arr[i]<arr[j]){
            ans[k++]=arr[i++];
        }
        else{
            ans[k++]=arr[j++];
        }
    }
    for(;i<=mid;i++){
        ans[k++]=arr[i];
    }
    for(;j<=h;j++){
        ans[k++]=arr[j];
    }
    for(i=l;i<=h;i++){
        arr[i]=ans[i];
    }
    }
    public  static void mergesort(int[] arr ,int l,int h){
    if(l<h){
       int  mid=(l+h)/2;
       mergesort(arr,l,mid);
       mergesort(arr, mid+1,h);
       merge(arr,l,mid,h);
    }
    }

    public static void main(String[] args) {

        int[] arr = {0,5,0,3,76,4,98,12,9,42};
    //    bubblesort(arr);
        //selectionsort(arr);
     //   moverightzero(arr);
        mergesort(arr , 0, arr.length-1);
        printarry(arr);
    }
}
