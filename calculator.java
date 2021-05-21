package hackerearth;
import java.util.*;
interface AdvancedArithmetic{
	int divisorSum(int n);
}
class mycalculator implements AdvancedArithmetic
{
    public int divisorSum(int n)
    {
        int sum = n;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
               
            }
        }
        return sum;      
    }
}
public class calculator {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		AdvancedArithmetic calc=new mycalculator();
	int sum=calc.divisorSum(n);
	System.out.println(sum);
		

	}

}
