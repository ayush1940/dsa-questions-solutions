package gfg;
import java.util.*;
public class Foreachloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.forEach(s-> System.out.println(s));

	}

}
