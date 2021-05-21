package hackerearth;
import java.util.*;
public class codechef {
	public static void main (String[] args) throws java.lang.Exception
	{
	try{
		Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int arr[][]=new int[m][m];
	        for(int i=0;i<m;i++){
	            for(int j=0;i<m;j++){
	                arr[i][j]=sc.nextInt();
	            }
	        }
	        for(int i=0;i<m;i++){
	            for(int j=i+1;j<m;j++){
	                arr[j][i]=10;
	                System.out.println(arr[j][i]);
	            }
	        }
	    }
		}catch(Exception e){
			return;
		}
	}
}
