package tw.myproject.oop.collections.generics;

class TestInteger{
	private Integer i1;

	public Integer getI1() {
		return i1;
	}

	public void setI1(Integer i1) {
		this.i1 = i1;
	}	
}

class TestDouble{
	private Double d1;

	public Double getD1() {
		return d1;
	}

	public void setD1(Double d1) {
		this.d1 = d1;
	}
}

//...
//全部繼承物件
class TestObject{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class TestGenerics<T>{
	private T t1;
	
	public T getT1(){
		return t1;
	}
	
	public void setT1(T t1){
		this.t1 = t1;
	}
}//指定一次所有得和自方法都會變同一個型別


public class CallTestGenericsEx1 {

	public static void main(String[] args) {
		
		TestGenerics<Integer> test1 = new TestGenerics<Integer>();
		test1.setT1(6);
		int num3 = test1.getT1();
		System.out.println("num3+1=" + (num3+1));
		
		TestGenerics<Double> test2 = new TestGenerics<Double>();
		test2.setT1(3.14);
		double num4 = test2.getT1();
		System.out.println("num4+1=" + (num4+1));
		
//		TestObject obj1 = new TestObject();
//		obj1.setObj(7);自動封裝
//		int num1 = (Integer)obj1.getObj();
//		System.out.println("num1+1=" + (num1+1));
		
		//double num2 = (Double)obj1.getObj();
		//System.out.println("num2+1=" + (num2+1));
		
	}

}
