class BankAccount{
	double totalAmt;
	BankAccount(){}
	BankAccount(double totalAmt){
		this.totalAmt=totalAmt;
	}
	
	double totalAmount() {
		return totalAmt;
	}
}
class Saving extends BankAccount
{
	double fixedDeposit;
	Saving(double fixedDeposit){
		this.fixedDeposit=fixedDeposit;
	}
	public double totalAmount() 
	{
		return (totalAmt+=fixedDeposit);		
	}
}
class Current extends BankAccount
{
	double cashCredit;
	Current(double cashCredit){
		this.cashCredit=cashCredit;
	}
	public double totalAmount() 
	{
		return (totalAmt+=cashCredit);		
	}
}
public class BankAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		Saving s=new Saving(30000);
		b.totalAmt=s.totalAmount();
		Current c=new Current(2000);
		b.totalAmt=b.totalAmt+c.totalAmount();
		
		System.out.println("Total amount in the bank is Rs."+b.totalAmt);
	}

}
