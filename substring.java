package hackerearth;
import java.util.*;
public class substring {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int v;
		int sum=0;
		int sum1=0;
		for(int i=0;i<s.length();i++) {
	       char ch=s.charAt(i);
	      v=Integer.parseInt(String.valueOf(ch));
	      sum+=v;
		}
      for(int i=0;i<s.length()-1;i++) {
    	  for(int j=i+1;j<s.length();j++) {
        	  String s2=s.substring(i,j+1);
        	  int v1=Integer.parseInt(s2);
        	 sum1+=v1;
        	 System.out.println(s2);
          }
    	  }
      
      System.out.println(sum1+sum);
	}

}
