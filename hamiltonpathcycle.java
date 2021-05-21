package gfg;
import java.util.*;
import java.io.*;
public class hamiltonpathcycle {
	static class Edge{
		int src;int nbr;
		Edge(int src,int nbr){
			this.src=src;this.nbr=nbr;
		}
	}
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int vtces=Integer.parseInt(br.readLine());
		ArrayList<Edge>graph[]=new ArrayList[vtces];
		for(int i=0;i<vtces;i++) {
			graph[i]=new ArrayList<>();
		}
		int edge=Integer.parseInt(br.readLine());
		for(int i=0;i<edge;i++) {
			String parts[]=br.readLine().split(" ");
			int v1=Integer.parseInt(parts[0]);
			int v2=Integer.parseInt(parts[1]);
			graph[v1].add(new Edge(v1,v2));
			graph[v2].add(new Edge(v2,v1));
		}
		int src=Integer.parseInt(br.readLine());
		HashSet<Integer>visited=new HashSet<>();
		hamilton(graph,src,visited,src+"",src);
		
	}
	public static void hamilton(ArrayList<Edge> graph[],int src,HashSet<Integer>visited,String psf,int osrc) {
		if(visited.size()==graph.length-1) {
			System.out.print(psf);
		
		boolean closingedgefound=false;
		for(Edge e:graph[src]) {
			if(e.nbr==osrc) {
				closingedgefound=true;
				break;
			}
		}
		if(closingedgefound==true) {
			System.out.println("*");
		}else {
			System.out.println(".");
		}
		return;
		}
		visited.add(src);
		for(Edge e:graph[src]) {
			if(visited.contains(e.nbr)==false) {
				hamilton(graph,e.nbr,visited,psf+e.nbr,osrc);
			}
		}
		visited.remove(src);
	}

}
