package gfg;

public class Countpathmaze {
	static int countpathmaze(int n,int i,int j) {
		if(i==n-1 && j==n-1) {
			return 1;
		}
		if(i>n ||j>n) {
			return 0;
		}
		return countpathmaze(n,i+1,j)+countpathmaze(n,i,j+1);
	}

	public static void main(String[] args) {
		System.out.println(countpathmaze(3,1,1));

	}

}
