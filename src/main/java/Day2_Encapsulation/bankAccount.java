package Day2_Encapsulation;

// encapsulation we cannot access variables directly from other class
// we should use to private keyword for all declared variables
// we can access variables and operate only thru methods

public class bankAccount {

	private int acno;
	private String name;
	private double balance;
	
	
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
