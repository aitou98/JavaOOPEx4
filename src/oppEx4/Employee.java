package oppEx4;

public class Employee {
	private int id,salary;
	private String firstName,lastName;

	public Employee(int id,int salary,String firstName , String lastName) {
		this.id = id;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getFirstName() {
		
		return this.firstName;
	}
	
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getName() {
		
		return firstName +" "+lastName ;

	}
	
   public int getSalary() {
		
		return this.salary;
	}
	
	public void setSalary(int salary) {
		
		this.salary = salary;
	}
	
    public int getAnnualSalary() {
		
		return this.salary * 12;
	}
    
    public int raiseSalary(int percent) {
    	
    	
    	
    	return 
    	salary = (salary * percent / 100) + salary;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", Name =" + getName() + " ]";
	}

	
    
	
	
}
