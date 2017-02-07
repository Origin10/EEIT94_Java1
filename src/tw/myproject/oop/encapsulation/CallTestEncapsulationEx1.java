package tw.myproject.oop.encapsulation;

class Bank{
	private int account =10000;
	//
	public int withdraw(int money){
		account = account - money;
		return money;
	}
	public void deposit(int money){
		account = account + money;
	}
	public void queryAccount(){
		System.out.println("account"+account);
		
	}
	
}


public class CallTestEncapsulationEx1 {

	public static void main(String[] args) {
		Bank iiiBank = new Bank();
		//iiiBank.account = 0;//private
		int myMoney = iiiBank.withdraw(3000);
		System.out.println("myMoney=" + myMoney);
		iiiBank.queryAccount();

	}

}
