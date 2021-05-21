package hackerearth;

import java.util.*;
 public class fibonacci {
    public static void main(String args[] )  {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int F;
      while(t-->0){
      int n=sc.nextInt();
      int m=sc.nextInt();
      if(m==2){
          F=2;
      }else{
           F= Math.abs((m-1)+(m-2));
       }
      System.out.println((n*F)%1000000009);
      }
    }
}

