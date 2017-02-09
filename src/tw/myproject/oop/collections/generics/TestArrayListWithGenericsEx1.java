package tw.myproject.oop.collections.generics;

import java.util.ArrayList;

public class TestArrayListWithGenericsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Jones");
		list1.add("Karen");
		list1.add("ian");
		
		System.out.println("list1="+list1);
		
		for(int i=0;i<list1.size();i++){
			if("Karen".equals(list1.get(i))){
				list1.remove(i);
				//i--ArrayList会将后面部分的元素依次往上挪一个位置（就是copy），所以，下一个需要访问的下标还是当前下标，所以必须得减一才能把所有元素都遍历完
			}//在if裡如果把會變動的取質不應該放在前面，不然可能產生null exception
			
			
			System.out.println(list1.get(i));
		}
		System.out.println("list1="+list1);
	}

}
