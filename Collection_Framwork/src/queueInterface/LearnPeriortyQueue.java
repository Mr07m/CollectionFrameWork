package queueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPeriortyQueue {
	public static void main(String[] args) {
		                                            //reverse order max order
		PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer(10);
		pq.offer(90);
		pq.offer(60);
		pq.offer(7);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
	}
}
