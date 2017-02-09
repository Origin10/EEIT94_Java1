package tw.myproject.oop.collections.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayListWithIteratorEx1 {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		
		fruit.add("Apple");
		fruit.add("PineApple");
		fruit.add("Banana");
		fruit.add("WaterMelon");
		fruit.add("JackFruit");
		
		Iterator<String> iterator = fruit.iterator();
		while(iterator.hasNext()){
			String fruitName = iterator.next();//資料一個一個取出來
			System.out.println("fruitName:" +fruitName);
		}
		
		for(String name: fruit){
			System.out.println(fruit);
		}
	}

}
