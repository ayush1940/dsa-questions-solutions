package hackerearth;
import java.util.*;
public class duplicatestring {
	 public static void main(String args[] )  {
	        Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        int count,sum=0;
	        while(t-->0){
	            String s=sc.next();
	        
	           char string[]=s.toCharArray();
	           int b=string.length;
	           for(int i=0;i<string.length;i++){
	               count=1;
	               for(int j=i+1;j<string.length;j++){
	                   if(string[i]==string[j] && string[i] != ' '){
	                       count++;
	                        //string[j]='0';
	                   }
	                  
	               }
	             if(count>1){
	                 sum+=count;
	             }
	           }
	         int c=b-sum;
	         if(c==sum){
	             System.out.println("YES");
	         }else{
	             System.out.println("NO");
	         }
	        }
}
}
