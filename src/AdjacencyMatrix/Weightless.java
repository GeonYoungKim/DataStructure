package AdjacencyMatrix;

import java.util.Scanner;

public class Weightless {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		
		int[][] matrix=new int[n+1][n+1];
		
		for(int i=0;i<m;i++) {
			int s,e;
			s=sc.nextInt();
			e=sc.nextInt();
			matrix[s][e]=1;
			matrix[e][s]=1;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
