package _1_lifo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class JavaQue {
	public static void main(String[] args) {
		Human human1 = new Human(1);
		Human human2 = new Human(2);
		Human human3 = new Human(3);
		Human human4 = new Human(4);
		Human human5 = new Human(5);

		Queue<Human> peoples = new LinkedList<>(); // FIFO - first input, first output.
		peoples.add(human3);
		peoples.add(human1);
		peoples.add(human4);
		peoples.add(human2);

		System.out.println(peoples + "\n");

		for (Human human : peoples) {
			System.out.println(human + " ");
		}
		System.out.println();

		Queue<Human> newPeople = new ArrayBlockingQueue<>(4); // FIFO - with capacity.
//		add() method
//		newPeople.add(human3);
//		newPeople.add(human2);
//		newPeople.add(human1);
//		newPeople.add(human4);
//		newPeople.add(human5); // Queue full!

		// offer() method
		newPeople.offer(human3); // true
		newPeople.offer(human2); // true
		newPeople.offer(human1); // true
		newPeople.offer(human4); // false
		newPeople.offer(human5); // Queue full!
		System.out.println(newPeople.offer(human5));
		System.out.println(newPeople);

//		System.out.println(newPeople);
//		newPeople.remove();
//		System.out.println(newPeople);
//		newPeople.remove();
//		System.out.println(newPeople);
//		newPeople.remove();
//		System.out.println(newPeople);
//		newPeople.remove();
//		System.out.println(newPeople);
//		newPeople.remove();

		System.out.println(newPeople);
		System.out.println(newPeople.poll());
		System.out.println(newPeople);
		System.out.println(newPeople.poll());
		System.out.println(newPeople);
		System.out.println(newPeople.poll());
		System.out.println(newPeople);
		System.out.println(newPeople.poll());
		System.out.println(newPeople);
		System.out.println(newPeople.poll());

	}
}
