package gfg;
import java.util.*;
public class grading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total no. of students are: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Write grade of all students and rounded grade are: ");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        	if(a[i]<38) {
        		System.out.println(a[i]);
        	}else {
           for(int j=1;j<=5;j++) {
        	   if((a[i]+j)%5==0) {
        		   if(j<3) {
        			   System.out.print(a[i]+j+" ");
        		   }
        		   if(j>=3) {
        			   System.out.print(a[i]+" ");
        		   }
        	   }
       		   
        	   }
           }
        }
	}

}
