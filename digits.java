package hackerearth;

import java.util.*;
public class digits {
    public static void main(String args[] )  {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       
       while(t-->0){
         String s=sc.next();
         int count1=0;
         int count2=0;
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='0'){
                 count1++;
             }
             else{
                 count2++;
             }
         }
             if(count1==1||count2==1){
                 System.out.println("Yes");
             }
             else{
                 System.out.println("No");
             }
         
       }

    }
}

