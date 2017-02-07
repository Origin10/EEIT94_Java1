package tw.myproject.oop.encapsulation;

public class CallTestEncapsulationEx2 {
	private String name = "Coco";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallTestEncapsulationEx2 encap2 = new CallTestEncapsulationEx2();
		encap2.setName("Luna");
		String Result = encap2.getName();
		System.out.println("myName="+Result);
		

	}

}
