package hackerearth;
import java.util.*;
public class pattern  {
              
public static void main(String[] args)   {
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 for(int i=1;i<=n;i++) {
	 for(int k=1;k<=n-i;k++) {
		 System.out.print("*");
	 }
	 for(int j=i;j<=i*2-1;j++) {
		 System.out.print(j);
	 }
	 for(int l=(i-1)*2; l>=i; l--) {
		 System.out.print(l);
	 }
	 for(int k=1;k<=n-i;k++) {
		 System.out.print("*");
	 }
	 
	 System.out.println();
 }
 

}  
}  