package hackerearth;
import java.util.*;
public class stringcount {
	 public static void main(String args[] )  {
	       Scanner sc=new Scanner(System.in);
	    
	       int n=sc.nextInt();
	       int count=0;
	       sc.useDelimiter("([,\\n])");
	       String s[]=new String[n];
	       for(int i=0;i<n;i++){
	    	   
	           s[i]=sc.next();
	       }
	            for(int i=0;i<n;i++){
	                for(int j=i+1;i<n;i++){
	                    if(s[i].equals(s[j])){
	                        count++;
	                    }
	                }
	            }
	            System.out.println(count);
	    }
}
