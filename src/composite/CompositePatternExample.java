package composite;

import java.util.ArrayList;
import java.util.List;

abstract class Account{
	public abstract float getBalance();
}

class DepositeAccount extends Account{
	private String accountNo;
	private float accountBalance;
	
	public DepositeAccount(String accountNo, float accountBalance) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;	
	}
	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}
}

class SavingAccount extends Account{
	private String accountNo;
	private float accountBalance;
	
	public SavingAccount(String accountNo, float accountBalance) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;	
	}
	@Override
	public float getBalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}
}

class CompositeAccount extends Account {
	private List<Account> accountList = new ArrayList<Account>();
	private float totalBalance;
	

	@Override
	public float getBalance() {
		
		for(Account a : accountList)
			totalBalance+=a.getBalance();
		return totalBalance;
	}
	
	 public void addAccount(Account acc) {
		    accountList.add(acc);
		  }

		  public void removeAccount(Account acc) {
		    accountList.add(acc);
		  }
	
}

class CompositePatternExample {
	public static void main(String arg[]) {
		CompositeAccount component = new CompositeAccount();

	    component.addAccount(new DepositeAccount("DA001", 100));
	    component.addAccount(new DepositeAccount("DA002", 150));
	    component.addAccount(new SavingAccount("SA001", 200));

	    float totalBalance = component.getBalance();
	    System.out.println("Total Balance : " + totalBalance);
		
	}
}
