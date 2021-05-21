package hackerearth;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Magicsquare {
	public static void main(String[] args) {
		int[][] square = new int[3][3];
		//int magic = 15; // Constant is 15 for magic square of 3x3 
		
		int[][] s1 = {{8,1,6},{3,5,7},{4,9,2}};
		int[][] s2 = {{6,1,8},{7,5,3},{2,9,4}};
		int[][] s3 = {{8,3,4},{1,5,9},{6,7,2}};
		int[][] s4 = {{4,3,8},{9,5,1},{2,7,6}};
		int[][] s5 = {{6,7,2},{1,5,9},{8,3,4}};
		int[][] s6 = {{2,7,6},{9,5,1},{4,3,8}};
		int[][] s7 = {{4,9,2},{3,5,7},{8,1,6}};
		int[][] s8 = {{2,9,4},{7,5,3},{6,1,8}};
		
		int[] diff = new int[8];
		
		//all possible 3x3 magic arrays
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				square[i][j] = scanner.nextInt();
				diff[0] += Math.abs(s1[i][j] - square[i][j]);
				diff[1] += Math.abs(s2[i][j] - square[i][j]);
				diff[2] += Math.abs(s3[i][j] - square[i][j]);
				diff[3] += Math.abs(s4[i][j] - square[i][j]);
				diff[4] += Math.abs(s5[i][j] - square[i][j]);
				diff[5] += Math.abs(s6[i][j] - square[i][j]);
				diff[6] += Math.abs(s7[i][j] - square[i][j]);
				diff[7] += Math.abs(s8[i][j] - square[i][j]);
			}
		}
		
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i < diff.length; i++) {
			if (diff[i] < minDiff) {
				minDiff = diff[i];
			}
		}
		
		System.out.println(minDiff);
		
		scanner.close();
	}
}