package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) {
		Prisonar prisoner1 = new Prisonar("james", 5);
		Prisonar prisoner2 = new Prisonar("schofield", 99);
		Prisonar prisoner3 = new Prisonar("alex", 14);
		Prisonar prisoner4 = new Prisonar("silvia", 10);
		Prisonar prisoner5 = new Prisonar("thomson", 1);

	    PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
	    priorityQueue.add(1);
	    priorityQueue.add(10);
	    priorityQueue.add(45);
	    priorityQueue.add(2);
	    priorityQueue.add(15);
	    
        
//	    priorityQueue.offer(prisoner1);
//	    priorityQueue.offer(prisoner2);
//	    priorityQueue.offer(prisoner3);
//	    priorityQueue.offer(prisoner4);
//	    priorityQueue.offer(prisoner5);
	    
	    
	  //내림차순
        PriorityQueue<Prisonar> reversedPriorityQueue = 
                new PriorityQueue<Prisonar>(priorityQueue.size(), Collections.reverseOrder());
        
	    while (!priorityQueue.isEmpty()) {
	    	int prisoner = priorityQueue.poll();
            System.out.println(prisoner);
        }
		
	}
}
