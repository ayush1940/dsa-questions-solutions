package hackerearth;
import java.util.*;
public class laddu {
	public static String extractInt(String str)
	{
		str = str.replaceAll("[^\\d]", " ");
		str = str.trim();
		str = str.replaceAll(" +", " ");

		if (str.equals(""))
			return "-1";

		return str;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       int t=sc.nextInt();
	       int ans1=0;
	       int ans2=0;
	       int ans3=0;
	       int ans4=0;
	       while(t-->0){
	        int n=sc.nextInt();
	         String s[]= new String[n];
	         String nat=sc.nextLine();
	          for(int i=0;i<n;i++){
	               s[i]=sc.nextLine();
	          }
	          for(int i=0;i<s.length;i++){
	              if(s[i].contains("CONTEST_WON")) {
	            	  ans1=Integer.parseInt(extractInt(s[i]));
	            	  if(ans1<=20) {
	            		  ans1=300+(20-ans1);
	            	  }
	              }
	              if(s[i].contains("TOP_CONTRIBUTOR")){
	                  ans2=300;
	              }
	              if(s[i].contains("BUG_FOUND")){
	                  ans3=Integer.parseInt(extractInt(s[i]));
	                 
	              }
	              if(s[i].contains("CONTEST_HOSTED")){
	                 ans4=50;
	              }
	          }
	          int f=ans1+ans2+ans3+ans4;
	          if(nat.contains("INDIAN")) {
	        	  System.out.println((int)f/200);
	          }else {
	        	  System.out.println(f/400);
	          }
	       }

	}

}
