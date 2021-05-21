package hackerearth;
import java.util.*;
public class subsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        sc.nextLine();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            String str = sc.nextLine();
            boolean flag = false;
            for(int i = 0; i < str.length()-1; i++){
                for(int j = i+1; j < str.length(); j++){
                    if(str.charAt(i) == str.charAt(j)){
                        flag = true;
                        break;
                    }
                }
            }
            if(flag){
                answer.add("yes");
            }else{
                answer.add("no");
            }
		}
		answer.forEach(System.out::println);
	}

}
