package tw.myproject.oop.collections.generics;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TestLotteryRicherEx1 {

	public static void main(String[] args) {
		HashSet<Integer> fantasy = new HashSet<Integer>();
		//無順序不重複

		Random r = new Random();
		
		while (fantasy.size() < 6) {
			int richNum = r.nextInt(42) + 1;
			// System.out.println("richNum=" + richNum);

			fantasy.add(richNum);
		}

		System.out.println("fantasy:" + fantasy);
		
		TreeSet<Integer> orderedRichNum = new TreeSet<Integer>(fantasy);
        System.out.println("orderedRichNum:" + orderedRichNum);
        
        /**
         * TreeSet与HashSet的区别在于,
         * TreeSet会自动按自然排序法给元素排序,
         * 即1排在2前,a排在b前,但是HashSet是根据元素的hashCode自动给元素排序的.
         * 如果我们不需要使用排序功能,应该使用HashSet,因为其性能优于TreeSet.上代码:
         **/
		
        //改變TreeSet的排序方式
//		TreeSet<Integer> orderedRichNum = new TreeSet<Integer>(new Comparator<Integer>(){
//
//			@Override
//			public int compare(Integer num1, Integer num2) {
//				return num2-num1;(原順序是num1-num2)
//			}
//			
//		});
//		orderedRichNum.addAll(fantasy);
//		System.out.println("orderedRichNum:" + orderedRichNum);
	}

}

