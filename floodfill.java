package gfg;

public class floodfill {

	public static void main(String[] args) {
	  int a[][]= {{1,1,1,1,1,1,1,1},
			      {1,1,1,1,1,1,0,0},
			      {1,0,0,1,1,0,0,1},
			      {1,2,2,2,2,2,2,2},
			      {0,0,0,0,0,0,0,0},
			      {1,1,1,0,0,0,0,0},
	  };
	  floodfill(a,1,1,3,1);
	  
	  
	}
    
	static void floodfill(int a[][],int r,int c, int tofill,int prevfill) {
    	 int rows=a.length;
    	 int cols=a[0].length;
    	 if(r<0||r>=rows||c<0||c>=cols)
    		 return;
    	 if(a[r][c]!=prevfill) {
    		 return;
    	 }
    	 floodfill(a,r+1,c,tofill,prevfill);
    	 floodfill(a,r-1,c+1,tofill,prevfill);
    	 floodfill(a,r,c-1,tofill,prevfill);
    	 floodfill(a,r,c,tofill,prevfill);
     }
}
