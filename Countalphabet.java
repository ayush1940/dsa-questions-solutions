package hackerearth;
import java.util.*;
public class Countalphabet{

public static void main(String args[] )  {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch1=0;char ch2=0;
       for(int i=0;i<s.length();i++) {
    	if(i%2==0) {
    		ch1=s.charAt(i);
    	}
    	if(i%2!=0) {
		    ch2=s.charAt(i);
	   }
       }
       if(ch1==ch2) {
    	   System.out.println("possible");
       }else {
    	   System.out.println("impossible");
       }
    }
}