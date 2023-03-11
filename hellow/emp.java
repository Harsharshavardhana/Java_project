package hellow;

public class emp {
	public String emp1;
	public int id;
	private int salary;
	
	public emp(String emp1, int id, int salary) {
		this.emp1=emp1;
		this.id=id;
	}
	public void display() {
		System.out.println("name of emp name"+ emp1);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
