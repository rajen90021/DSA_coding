package in.adarsh.practice;

import java.util.HashMap;

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
    public static boolean validanogram(String str1, String str2){

        HashMap<Character ,Integer> map= new HashMap<>();
     for(int i=0;i< str1.length();i++){
                  char c = str1.charAt(i);
                  if(map.containsKey(c)){
                      int oldfre= map.get(c);
                      int newfre= oldfre+1;
                      map.put(c,newfre);
                  }
                  else{
                      map.put(c,1);
                  }
     }
        HashMap<Character ,Integer> map2= new HashMap<>();
        for(int i=0;i< str2.length();i++){
            char c = str2.charAt(i);
            if(map2.containsKey(c)){
                int oldfre= map2.get(c);
                int newfre= oldfre+1;
                map2.put(c,newfre);
            }
            else{
                map2.put(c,1);
            }
        }

        return map.equals(map2);

    }
    public static void removevowelinstring(String s){

        StringBuffer st= new StringBuffer();
        String ans="";
        for(int i=0;i< s.length();i++){
            char c= s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                continue;
            }
            else{
                st.append(c);
                ans+=c;
            }

        }
        System.out.println(st);

    }
    public static void removespacetring(String s){

        String ans="";
        for(int i=0;i< s.length();i++){
            char c= s.charAt(i);
            if(c==' '){
                continue;
            }
            else {
                ans+=c;
            }
        }
        System.out.println(ans);

    }
    public static void removecharacter(String s){
        /// 1,2,%,*,&,^,$,#
        String ans="";
        for(int i=0;i< s.length();i++){
            char c = s.charAt(i);
            if(c=='1'|| c=='2'|| c=='%'||c=='*'||c=='&'||c=='^'||c=='$'||c=='#'){
                continue;
            }
            else {
                ans+=c;
            }
//System.out.println(ans);
        }
        System.out.println(ans);
    }
    public static void findlargestword(String s){
        //Google Doc

//        int maxLength = 0;
//        int currentLength = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == ' ') {
//                // Compare and assign the maximum length
//                if (currentLength > maxLength) {
//                    maxLength = currentLength;
//                    currentLength = 0;
//                }
//               // reset the current length
//            } else {
//                currentLength++;
//            }
//        }
//
//// After the loop, check for the last word if the string didn't end with a space
//        if (currentLength > maxLength) {
//            maxLength = currentLength;
//        }
//        System.out.println(maxLength);
        s+=" ";
        String ans="";
        String lg="";
        for(int i=0;i< s.length();i++){
            char ch= s.charAt(i);
            if(ch!=' '){
                ans+=ch;
            }
            else{
              if(ans.length()>lg.length()){
                  lg=ans;
              }
              ans="";
            }
        }
        System.out.println(lg);

    }
    public static void finaa(String str1,String str2){

         int length= str2.length();

        HashMap<String,Integer> map= new HashMap<>();
        for(int i=0;i< str1.length();i++){

          String  stringstr1= String.valueOf(str1.charAt(i));
       //     System.out.println(stringstr1);
//            char c= str1.charAt(i);
//
            if(map.containsKey(stringstr1)){
                int oldfre= map.get(stringstr1);
                int newfre= oldfre+1;
                map.put(stringstr1,newfre);
            }
            else {
                map.put(stringstr1,1);
            }
        }

           if(map.containsKey(str2)){
              int value2= map.get(str2);

              int ans= value2/length;
               System.out.println(ans);
           }

    }
    public static int sumofdigit(int n){

//        int sum=0;
//        while(n>0){
//            int rem=n%10;
//            sum+=rem;
//            n=n/10;
//        }
//        System.out.println(sum);
        if(n>=0 && n<=9){
            return n ;
        }
          int small=  sumofdigit(n/10);
        int ans= small+ n%10;
        return ans;
    }
    public static void printmultipal(int n,int k){

        if(k==1){
            System.out.println(n);
            return ;
        }

        printmultipal(n,k-1);
        System.out.println(n*k);
    }
    public static int sumarray(int[] arr,int inx){

        if(arr.length==inx){
            return arr[0];
        }
        int smalans= sumarray(arr,inx+1);
        return smalans+arr[inx];

    }
    public static void main(String[] args) {
        int n=10;
     //   printnnaturalnousingrecursion(n);
        //System.out.println( fctorial(n));
int[] arr= {1,2,3,4,5};

//       for(int i=0;i<=n;i++) {
//           System.out.println(fibonace(i));
//       }
        String str1= "Goosglxxxxxxxxxxxxxxxxse sssssssssssc";
//        String str2="nagaram";
//        System.out.println(validanogram(str1,str2));
//        removevowelinstring(str1);
       // removespacetring(str1);
//        removecharacter(str1);
       // findlargestword(str1);
//        String str= "aaaaabbbaaaa";
//        String str2="aa";
//        char c='a';
//        finaa(str,str2);
//        System.out.println( sumofdigit(2345));
       // printmultipal(4,5);
        System.out.println( sumarray(arr,0));
    }
}
