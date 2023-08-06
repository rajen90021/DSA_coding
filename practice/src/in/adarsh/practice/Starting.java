package in.adarsh.practice;

import java.util.Arrays;
import java.util.HashMap;

public class Starting {
public static  void valueoccurance(int[] arr,int val){

//
//    int count=0;
//    for (int i=0;i< arr.length;i++){
//        if(val==arr[i]){
//            count++;
//        }
//    }
//    System.out.println(val+" occures time "+count);
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int value : arr){
            if(map.containsKey(value)){
                int oldfrequency= map.get(value);
                int newfrequency = oldfrequency+1;
                map.put( value,newfrequency);
            }else {
                map.put(value,1);
            }
        }

//    for(int data: map.keySet()){
//        int valuess= map.get(data);
//        System.out.println("key is  " +data+ "  value is "+valuess);
//    }
    for(int gettingvalue: map.keySet()){
        if(val==gettingvalue){
            System.out.println("25 is occures "+ map.get(gettingvalue));
        }
    }

}
       public static int searchelement(int[] arr ,int n){
           for(int i=0;i< arr.length;i++){
               if(n==arr[i]){
                   return i;
               }
           }
           return -1;
       }
    public  static void largestelement(int[] arr){
//        int min= Integer.MAX_VALUE;
//        int max =Integer.MIN_VALUE;
//        for(int i=0;i< arr.length;i++){
//
//            if(max<arr[i]){
//               max=arr[i];
//            }
//            if(min>arr[i]){
//                min=arr[i];
//            }
//        }
//        System.out.println("max is "+max);
//        System.out.println("max is "+min);
    Arrays.sort(arr);
        System.out.println("min is "+arr[0]);
        System.out.println("max is "+arr[arr.length-1]);
    }
    public static void lastoccurane(int[] arr ,int n) {
//        int count = 1;
//
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < arr.length; i++) {
//
//            if (n == arr[i]) {
//                map.put(arr[i], i);
//            }
//        }
//        int value=-1;
//        for (int gettingvalue : map.keySet()) {
//            if (n == gettingvalue) {
//                 value= map.get(gettingvalue);
//                break;
//            }
//        }
//        System.out.println("last occurance index is is "+value);
///***********************************************************************************************
        int count =-1;
        for (int i=0;i<arr.length;i++){
            if(n==arr[i]){
                count=i;
            }
        }
        System.out.println("value is "+count);
    }
    public static boolean issorted(int[] arr){
    boolean value = true;
    for (int i=0;i< arr.length-1;i++){
        if(arr[i]<arr[i+1]){
            continue;
        }
        else{
            value=false;
            break;
        }
    }


    return value;
    }
    public static int[] returnmaxandmin(int[] arr){
      Arrays.sort(arr);
      int[] ans= new int[2];
      ans[0]=arr[0];
      ans[1]=arr[arr.length-1];
      return  ans;
    }
    public static void targetsum(int[] arr ,int target) {

//    int count=0;
//    for (int i=0;i< arr.length;i++){
//     for(int j=i+1;j<arr.length;j++){
//         if(arr[i]+arr[j]==target){
//             count++;
//         }
//     }
//    }
//        System.out.println(count);
HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
int count=0;
            for(int value: arr) {

                if(map.containsKey(value)){
                    int oldfre= map.get(value);
                    int newfre= oldfre+1;
                    map.put(value,newfre);
                }
                else{
                    map.put(value,1);
                }
            }
            for(int val2: arr){
                if(map.containsKey(target-val2)){
                    count += map.get(target-val2);
                }
            }
        System.out.println(count/2);

}
public static void uniquenoinrepatingarray(int[] arr){

//    HashMap<Integer,Integer> map= new HashMap<>();
//    for(int data : arr) {
//        if (map.containsKey(data)) {
//            int oldfre = map.get(data);
//            int newfre = oldfre + 1;
//            map.put(data, newfre);
//        } else {
//            map.put(data, 1);
//        }
//    }
//    for(int getvalue : map.keySet()){
//        int val = map.get(getvalue);
//        if(val==1){
//            System.out.println("unique element is "+getvalue);
//            break;
//        }
//        //System.out.println(getvalue+"  "+val);
//    }
//  //  System.out.println(getvalue+"  "+val);

    for(int i=0;i< arr.length;i++){


        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }

          }
        }
    for(int ans : arr){
        if(ans>0){
            System.out.println("ans is "+ans);
        }
    }
}
public static void secondlargest(int[] arr){
    int max=Integer.MIN_VALUE;
    for(int data : arr){
        if(max<data){
            max=data;
        }
    }
    System.out.println(max);
    for (int i= 0;i< arr.length;i++){
        if(arr[i]==max){
            arr[i]= -1;
        }
    }
    for (int i=0;i<arr.length;i++){
        System.out.print(" "+arr[i]);
    }
    int max2= Integer.MIN_VALUE;
    for (int data : arr){
        if(max2<data){
            max2=data;
        }
    }
    System.out.println("\n second largest is \n"+max2);
}

    public static void main(String[] args) {
        int[] arr = {3,4,5,19,2,55,91,9};

      //  largestelement(arr);
      //  int value = searchelement(arr, 0);
       // System.out.println("value is "+ value);
        //valueoccurance(arr,25);
//        //lastoccurane(arr,25);
//        System.out.println("array is sorted "+issorted(arr));
//        int[] ans2  =   returnmaxandmin(arr);
//        for (int i=0;i<ans2.length;i++){
//            System.out.println(""+ans2[i]);
        //targetsum(arr, 2);
//        uniquenoinrepatingarray(arr);
        //secondlargest(arr);
}
    }

