package oppEx4;

public class Main {

	public static void main(String[] args) {
		
		 Account a1 = new Account("A101", "aitoukallal", 88);
	      System.out.println(a1);  // toString();
	      Account a2 = new Account("A102", "alaoui"); // default balance
	      System.out.println(a2);

	      // Test Getters
	      System.out.println("ID: " + a1.getID());
	      System.out.println("Name: " + a1.getName());
	      System.out.println("Balance: " + a1.getBalance());

	      // Test credit() and debit()
	      a1.credit(100);
	      System.out.println(a1);
	      a1.debit(50);
	      System.out.println(a1);
	      a1.debit(500);  // debit() error
	      System.out.println(a1);

	      // Test transfer()
	      a1.transaferTo(a2, 100);  // toString()
	      System.out.println(a1);
	      System.out.println(a2);

	}

}



/*



// Test constructor and toString()
	      Employee e1 = new Employee(8, 2500 ,"yassine", "aitou");
	      System.out.println(e1);  // toString();

	      // Test Setters and Getters
	      e1.setSalary(999);
	      System.out.println(e1);  // toString();
	      System.out.println("id is: " + e1.getId());
	      System.out.println("firstname is: " + e1.getFirstName());
	      System.out.println("lastname is: " + e1.getLastName());
	      System.out.println("salary is: " + e1.getSalary());

	      System.out.println("name is: " + e1.getName());
	      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

	      // Test raiseSalary()
	      System.out.println(e1.raiseSalary(10));
	      System.out.println(e1);






*/