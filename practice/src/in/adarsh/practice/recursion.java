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

        int maxLength = 0;
        int currentLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                // Compare and assign the maximum length
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    currentLength = 0;
                }
               // reset the current length
            } else {
                currentLength++;
            }
        }

// After the loop, check for the last word if the string didn't end with a space
        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        System.out.println(maxLength);

    }
    public static void main(String[] args) {
        int n=10;
     //   printnnaturalnousingrecursion(n);
        //System.out.println( fctorial(n));


//       for(int i=0;i<=n;i++) {
//           System.out.println(fibonace(i));
//       }
        String str1= "Goosglse sssssssssssc";
//        String str2="nagaram";
//        System.out.println(validanogram(str1,str2));
//        removevowelinstring(str1);
       // removespacetring(str1);
//        removecharacter(str1);
        findlargestword(str1);
    }
}
