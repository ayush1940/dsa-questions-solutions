package hackerearth;
import java.util.*;
public class cops {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-->0){
	            int m=sc.nextInt();
	            int x=sc.nextInt();
	            int y=sc.nextInt();
	            int a[]=new int[100];
	            int temp=x*y,num;
	            for(int i=0;i<m;i++){
	                num=sc.nextInt();
	                int b=num-temp;
	                if(b<1){
	                    b=1;
	                }
	               int c=num+temp;
	    	        if(c>100)
	    	            c=100;
	    	        for(int j=(b-1);j<c;j++){
	    	            a[j] = 1;
	    	        }
	            }
	            int count=0;
	    	    for(int i=0;i<100;i++){
	    	        if(a[i]==0){
	                    count=count+1;	            
	    	        }
	    	        else{
	    	            a[i]=0;
	    	        }
	    	    }
	    	    System.out.println(count);
	        }
			
		}

	}


