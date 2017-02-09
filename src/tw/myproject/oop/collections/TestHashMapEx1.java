package tw.myproject.oop.collections;


import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class TestHashMapEx1 {

	public static void main(String[] args) {
		HashMap map1 = new HashMap();
		
		//
		map1.put("1st","James");//key,value
		map1.put("2nd","John");
		map1.put("3rd","Jones");
		map1.put("3rd","Janet");
		
		Set set1 = map1.keySet();
		Set set2 = map1.entrySet();
		Collection collect1 =map1.values();
		
		System.out.println("set1="+set1);
		System.out.println("set2="+set2);
		System.out.println("collect1="+collect1);
		
		Set mapping = map1.entrySet();
        Set keys = map1.keySet();
        Collection values = map1.values();
        
        System.out.println("mapping=" + mapping);
        System.out.println("keys=" + keys);
        System.out.println("values=" + values);
        
        String first = (String)map1.get("1st");
        System.out.println("first:" + first);
		
		
	}

}
