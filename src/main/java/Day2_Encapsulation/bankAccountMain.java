package Day2_Encapsulation;

public class bankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bankAccount acc=new bankAccount();
		
		acc.setAcno(2643254);
		acc.setName("prabha");
		acc.setBalance(10000);
		
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());

	}

}
