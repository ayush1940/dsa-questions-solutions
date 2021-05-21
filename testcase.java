package hackerearth;
import java.util.*;
import java.lang.*;
import java.io.*;

 public class testcase
{
	public static void main (String[] args) throws java.lang.Exception
	{
        int a[]={1,2,4,8,16,32,64,128,256,512,1024,2048},i,t,p;
        
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0)
        {
        	int sum=0;
        	int count=0;
            int c=0;
            p=sc.nextInt();
            for(i=11;i>=0;i--)
            {
                if(p>=a[i])
               {
                   p-=a[i];
                   c++;
                   //i--;
               }
            }
            System.out.println(c);
            for(int j=4;j>=1;j--) {
            if(p>=i) {
            	count++;
            	++i;
            }
            }
            System.out.println(count);
        }
    }
}


