package queueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
	public static void main(String[] args) {
		Queue<Integer>queue=new LinkedList<>();
		//insert the element
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		//print the queue
		System.out.println(queue);
		//remove the fisrt element
		System.out.println(queue.poll());
		//check the which one is the next for removing element
		System.out.println(queue.peek());
	}
}
