package hackerearth;


import java.util.*;
public class Testcla {
    public static void main(String args[] )  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1;
        int count=0;
        int a[]=new int[n];
        for(int i=1;i<=n;i++){
            sum*=i;
        }
        while(sum>0){
       int total=sum%10;
       sum/=10;
       if(total==0){
           count+=1;
       }
    
        }
       System.out.println(count);
    }
}

