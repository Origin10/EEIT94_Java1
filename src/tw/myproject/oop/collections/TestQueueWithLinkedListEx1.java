package tw.myproject.oop.collections;

import java.util.LinkedList;

public class TestQueueWithLinkedListEx1 {

	private static LinkedList queue;
	
	public void processStoreQueue(){
		queue = new LinkedList();
		queue.offer("nickname");
		queue.offer("superman");
		
		//FIFO 先進先出
		
	}
	
	public void processRetrieveQueue(){
		while(queue.peek()!=null){
			String info = (String)queue.poll();
			System.out.println("info:"+info);
		}
		
	}

	public static void main(String[] args) {
		TestQueueWithLinkedListEx1 test1 = new TestQueueWithLinkedListEx1();
		test1.processStoreQueue();
		test1.processRetrieveQueue();

	}

}
