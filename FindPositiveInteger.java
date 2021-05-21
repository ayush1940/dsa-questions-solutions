package hackerearth;
import java.util.*;
public class FindPositiveInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
    	Scanner tk=new Scanner(s);
		sc.useDelimiter(" ");
		 String s1[]=s.split(", ");
		int a[]=new int[s1.length];
		
		for(int i=0;i<s1.length;i++) {
			a[i]=Integer.parseInt(String.valueOf(s1[i]));
		}
		Arrays.sort(a);
		ArrayList<Integer>al=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			al.add(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==-(Math.abs(a[i]))) {
				al.remove(i);
			}
		}
     Set<Integer>set=new HashSet<>();
     for(int i=0;i<al.size();i++) {
    	 set.add(al.get(i));
     }
     int arr[]=new int[al.size()];
     int i=0;
     for(Integer x:set) {
    	 arr[i++]=x;
     }
     int ans[]=new int[al.size()];
     for(int j=0;j<al.size()-1;j++) {
    	 if(arr[j]+1!=arr[j+1]) {
    		 ans[j]=arr[j]+1;
    	 }
     }
		System.out.println(ans[0]);
    }
	}


