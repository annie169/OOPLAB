import java.io.*;
import java.util.*;
class j11_PriorityQueue {
	public static void main(String args[])
	{
		// Creating empty priority queue
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();

		// Adding items to the pQueue using add()
		pqueue.add(10);
		pqueue.add(20);
		pqueue.add(15);
    pqueue.add(90);
    pqueue.add(50);
  System.out.println("PriorityQueue elements:");
Iterator itr=pqueue.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}

		// Printing the top element of PriorityQueue
		System.out.println("top element of priority queue is "+pqueue.peek());
}
}
