package queueInterface;

import java.util.ArrayDeque;

public class LearnArrayDeque {
	public static void main(String[] args) {
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offer(90);
		adq.offer(80);
		// add first
		adq.offerFirst(100);
		System.out.println("First Element: " + adq);
		// add last
		adq.offerLast(200);
		System.out.println("Last Element: " + adq);

		System.out.println("Peek First Element: " + adq.peekFirst());
		System.out.println("Peek Last Element: " + adq.peekLast());

		System.out.println("Poll First: " + adq.pollFirst());
		System.out.println("Poll Last: " + adq.pollLast());
	}
}
