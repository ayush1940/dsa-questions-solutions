package hackerearth;
import java.util.*;
public class chararray {
	public static void main(String args[] )  {
	     Scanner sc=new Scanner(System.in);
	     String s=sc.next();
	     char ch[]=s.toCharArray();
//	     int n=ch.length-1;
//	     System.out.println(ch[n]);
	     for(int i=0;i<=ch.length-1;i++){
	         if(i==ch.length-1){
	             if(ch[i]=='s'){
	          System.out.println("true");
	         }
	      else{
	          System.out.println("false");
	      }
	         }
	    
	    
	     }

	    }
}
