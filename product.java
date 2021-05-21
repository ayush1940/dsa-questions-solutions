package hackerearth;
import java.util.*;
public class product {
	public static void main(String args[] ){
		
		       Scanner sc=new Scanner(System.in);
		       String s=sc.nextLine();
		       int a[]=new int[s.length()];
			       for(int i=0;i<s.length();i++) {
			    	   a[i]=Integer.parseInt(s.valueOf(s.charAt(i)));
			       }
			       
			        for(int i=0;i<s.length()-1;i++){
			          String s1=String.valueOf(a[i]*a[i+1]);
			          if(s.contains(s1)==true) {
			        	  System.out.print(a[i]*a[i+1]+" ");
			          }
			        }
	    }
}
