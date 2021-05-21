package hackerearth;
import java.util.*;
public class maxweight {
	public static void main(String args[] )  {
        Scanner sc=new Scanner(System.in);
        int sum1=0;
        int sum2=0;
        int t=sc.nextInt();
        while(t-->0){
         int n=sc.nextInt();
         int k=sc.nextInt();
         int w[]= new int[n];
         for(int i=0;i<n;i++){
             w[i]=sc.nextInt();
         }
           Arrays.sort(w);
          // System.out.println(Arrays.toString(w));
           for(int v=0;v<k;v++){
               sum1+=w[v];
           }
           for(int j=k;j<n;j++){
               sum2+=w[j];
           }
             System.out.println(sum2-sum1);
        }
     }
}
