package in.adarsh.practice;

public class recursion {

    public static int fibonace(int n){
        if(n==0 || n==1)
            return n;
        int prev= fibonace(n-1) ;
        int nexrprev=  fibonace(n-2);
return prev+nexrprev;
    }
public static int  fctorial(int n){
    if(n==1){
        return n;
    }
        return n* fctorial(n-1);

}
    public static void printnnaturalnousingrecursion(int n){

        if(n==1){
            System.out.println(n);
            return;
        }
        else {
            System.out.println(n);
            printnnaturalnousingrecursion(n-1);
          //  System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n=10;
     //   printnnaturalnousingrecursion(n);
        //System.out.println( fctorial(n));


       for(int i=0;i<=n;i++) {
           System.out.println(fibonace(i));
       }
    }
}
