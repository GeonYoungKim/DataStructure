package AdjacencyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DirectedAdList {
	/*
	* 방향성이 있는 그래프를 인접 리스트로 구현
	 */
	
	static int nV;
	static int nE;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		nV=sc.nextInt();
		nE=sc.nextInt();
		
		ArrayList<ArrayList<Integer>> adList=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<nV;i++) adList.add(new<Integer> ArrayList());
		
		for(int i=0;i<nE;i++) {
            int vertex1, vertex2;
            vertex1 = sc.nextInt();
            vertex2 = sc.nextInt();
            
            adList.get(vertex1).add(vertex2);
        }

		for(int i=0;i<nV;i++) {
			Iterator<Integer> iter=adList.get(i).iterator();
			System.out.print(i);
			if(iter.hasNext()) {
				System.out.print("-");
			}
			while(iter.hasNext()) {
				System.out.print(iter.next()+" ");
			}
			System.out.println();
		}

	}
}
