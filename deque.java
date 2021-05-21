package gfg;
import java.util.*;
public class deque {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Deque<Integer>deck=new LinkedList<>();
	deck.addFirst(5);
	deck.addFirst(10);
	deck.addLast(6);
	System.out.println(deck);
	
	System.out.println(deck.getFirst());
	deck.removeLast();
	System.out.println(deck);

	}

}
