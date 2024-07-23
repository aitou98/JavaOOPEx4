package oppEx4;

//1.6  Ex: The Account Class

public class Account {
	
	private String id , name;
	private int balance=0;

	public Account(String id , String name) {
		
		this.id = id;
		this.name = name;
		this.balance = 0;
	}
	
   public Account(String id , String name,int balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

public String getID() {
	return id;
}

public String getName() {
	return name;
}

public int getBalance() {
	return balance;
}

	public int credit(int amount) {
				balance = balance + amount;
			return balance;
	
	
	}

	public int debit(int amount) {
		if (amount <= balance)
		{
			balance = balance - amount;
			return balance;
			
		}
		else {
			System.out.println("le montant selectioner est plus grand la balance ");
			return balance;
		}


}
	
	
	public int transaferTo(Account account,int amount) {
		if (amount <= balance)
		{
			account.credit(amount);
			return balance;
			
		}
		else {
			System.out.println("le montant selectioner est plus grand la balance ");
			return balance;
		}


}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	

	

   

	
	
	
}
