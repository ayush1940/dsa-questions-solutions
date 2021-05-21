package gfg;
import java.io.*;
import java.util.*;
public class BREADTHFIRSTSEARCH {
	static class Edge{
		int src;int nbr;
		Edge(int src,int nbr){
			this.src=src;this.nbr=nbr;
		}
	}
	static class pair{
		int v;String psf;
		pair(int v,String psf){
			this.v=v;this.psf=psf;
		}
	}
  public static void main(String []args)throws Exception{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int v=Integer.parseInt(br.readLine());
	  ArrayList<Edge>graph[]=new ArrayList[v];
	  for(int i=0;i<v;i++) {
		  graph[i]=new ArrayList<>();
	  }
	  int e=Integer.parseInt(br.readLine());
	  for(int i=0;i<e;i++) {
		  String parts[]=br.readLine().split(" ");
		  int v1=Integer.parseInt(parts[0]);
		  int v2=Integer.parseInt(parts[1]);
		  graph[v1].add(new Edge(v1,v2));
		  graph[v2].add(new Edge(v2,v1));
	  }
	  int src=Integer.parseInt(br.readLine());
	  ArrayDeque<pair>queue=new ArrayDeque<>();
	  boolean visited[]=new boolean[v];
	  queue.add(new pair(src,src+""));
	  while(queue.size()>0) {
		  pair remove=queue.removeFirst();
		  if(visited[remove.v]==true) {
			  continue;
		  }
		  visited[remove.v]=true;
		  System.out.println(remove.v+"@"+remove.psf);
		  for(Edge em:graph[remove.v]) {
			  if(visited[em.nbr]==false) {
				  queue.add(new pair(em.nbr,remove.psf+em.nbr));
			  }
		  }
	  }
  }
}
