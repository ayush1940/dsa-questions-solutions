package hackerearth;
import java.util.*;
public class Missing {
	public static void main(String args[] )  {
	    Scanner sc=new Scanner(System.in);
	    int a[]=new int[4];
	    for(int i=0;i<4;i++){
	     a[i]=sc.nextInt();
	    }   
	    Arrays.sort(a);

      for(int i=0;i<4;i++) {
    	  if(Math.abs(a[i])+a[i]!=0) {
    		  if(a[i]+1==a[i]) {
    			  System.out.println(a[i]+1);
    		  }
    	  }
      }


	    }
}
