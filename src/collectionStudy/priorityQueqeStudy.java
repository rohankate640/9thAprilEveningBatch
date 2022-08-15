package collectionStudy;

import java.util.PriorityQueue;

public class priorityQueqeStudy {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(26);
		pq.add(10);
		pq.add(6);
		pq.add(57);
		System.out.println(pq);

		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove(26));
		System.out.println(pq);
		System.out.println(pq.element());
		System.out.println(pq);

	}

}
