/**
 * 
 */
package queue;

import java.util.PriorityQueue;

/**
 * @author Abhishek
 *
 */
public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue  p = new PriorityQueue();
		System.out.println("peek "+ p.peek());
		//System.out.println("elemene " + p.element());
		for(int i =0; i<=10;i++) {
			p.offer(i);
		}
		System.out.println("p");
		System.out.println("poll " + p.poll());
		System.out.println("pppp "+ p) ;
		
		

	}

}
