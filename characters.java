package hackerearth;
import java.util.*;
public class characters {
	public static void main(String args[] )  {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int count1=0;
	    int count2=0;
	   char ch[]=s.toCharArray();
	    for(int i=0;i<ch.length;i++) {
	    if(Character.isLetter(ch[i])){
	        count1++;
	    }   
	    if(Character.isDigit(ch[i])){
	        count2++;
	    }
	   
	    }
	    System.out.println("LETTERS "+count1);
	    System.out.println("DIGITS "+count2);
	    }
}
