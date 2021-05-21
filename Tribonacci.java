package hackerearth;
import java.util.*; 
import java.io.*;
class Tribonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till u want Tribonacci series: ");
        int n=sc.nextInt();

        int a = 0,b = 1,c = 1;
        int d = a+b+c;
       // int sum=0;
        int e=a+b+c;
        

        System.out.println("\nTribonacci Series: ");
      // System.out.print(a+"\t"+b+"\t"+c);

        for(int i=4;i<=n;i++)
        {
          // System.out.print("\t"+d);
           // sum+=d+i;
            a=b;
            b=c;
            c=d;
            d=a+b+c;
            
        }

        System.out.println(d+e);
    }
}
