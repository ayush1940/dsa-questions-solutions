package gfg;
import java.util.*;
public class ComparatorVScomparable {
	static class Student implements Comparable<Student>{
	    int rollno;
	    String name;
	    int wt;
	    Student(int rollno,String name,int wt){
	        this.rollno=rollno;this.name=name;this.wt=wt;
	    }
	    public int compareTo(Student o){
	        return this.rollno-o.rollno;
	    }
	    public String toString(){
	        return "rollno= "+this.rollno+"," + "name="+this.name+","+ "wt= "+this.wt;
	    }
	}
	static class namecomp implements Comparator<Student>{
	    public int compare(Student s1,Student s2){
	        return s1.name.compareTo(s2.name);//sorting by name.else s1.wt-s2.wt;
	    }
	}
	/*comparable interface are declared inside the main class but comaprator interface are declared in differnt class
	  in comparable interface collections.sort are used simply but in comparator we need to typecast collections.sort with comparator
	  class name.*/
	public static void main(String[] args){
	   ArrayList<Student>pq=new ArrayList<>();
	   //PriorityQueue<Student>pq=new PriorityQueue<>(new namecomp()):
	    pq.add(new Student(21,"pant",65));
	     pq.add(new Student(25,"dhoni",62));
	     pq.add(new Student(29,"rohit",25));
	    pq.add(new Student(22,"virat",75));
	    
	    Collections.sort(pq,new namecomp());
	    pq.forEach(System.out::println);
	   // System.out.println("****************************");
	   //while(pq.size()>0){
	   //    System.out.println(pq.peek());
	   //    pq.remove();
	   //}
	    
	}
}
