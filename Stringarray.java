package hackerearth;
import java.util.*;
public class Stringarray {
	
	

	public static void main(String args[] )  {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s[]=new String[n];
            for(int i=0;i<n;i++){
                s[i]=sc.next();
            }
              for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                   if(s[i].compareTo(s[j])>0) {
                   String temp=s[i];
                   s[i]=s[j];
                   s[j]=temp;
                   }
                }
              }
              for(int i=0;i<n;i++) {
              s = new HashSet<String>(Arrays.asList(s)).toArray(new String[0]);
              System.out.println(s);
              }
        }

    }
}

