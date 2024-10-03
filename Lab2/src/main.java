import java.util.List;
import java.util.ArrayList;

abstract class Employee {
	
	protected String name;		
	protected Integer exp;
	protected Integer projects;
	protected Integer score;
	protected String position;

	public Employee(String name, int exp, int projects, String position) {
		this.name = name;
		this.exp = exp;
		this.projects = projects;
		this.position = position;
	}
	
	public abstract int calculateSalary();

	public String getName() {
		return name;
	}	
	public String getExp() {
		return "this employee has" + exp.toString() + "years of experience";
	}
	public String getProjects() {
		return "this employee finished " + projects.toString() + "amount of projects";
	}
	public String getPosition() {
		return position;
	}
	public void evaluateWork(Integer score) {
		this.score = score;
		System.out.println("The employee's work rated " + score.toString() );
	}
	public String giveTask(String task) {
		return position + name + " was given task " + task;
	}
}


class Manager extends Employee {
	
	public Manager(String name, int exp, int projects) {
		super(name, exp, projects, "Manager");
	}
	
	@Override
	public int calculateSalary() {
		return 5000 + 200*exp + 100*projects ;
	}
	
}	


class Developer extends Employee {

	public Developer(String name, int exp, int projects) {
		super(name, exp, projects, "Developer");
	}		
	@Override
	public int calculateSalary() {
		return 4000 + 150*exp + 50*projects;
	}
		
}


class Designer extends Employee {

	public Designer(String name, int exp, int projects) {
		super(name, exp, projects, "Designer");
	}
	
	@Override
	public int calculateSalary() {
		return 3500 + 100*exp + 25*projects;
		
	}
	
}

class Company {
	private List<Employee> employeers;
	
	public Company() {
		employeers = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		employeers.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		System.out.println(employee.getName() + " was fired");
		employeers.remove(employee);
	}
	
	public void showSalaries() {
		for(Employee emp : employeers) {
			System.out.println(emp.getPosition() + " " + emp.getName() + ": " + emp.calculateSalary());
		}
	}
}

public class main {

	public static void main(String[] args) {
		Company corp = new Company();
		
		Manager Jake = new Manager("Jake", 3, 666);
		Manager John = new Manager("John", 4, 667);
		Developer Joe = new Developer("Joe", 5, 668);
		Developer Jay = new Developer("Jay", 6, 669);		
		
		corp.addEmployee(Jake);
		corp.addEmployee(John);
		corp.addEmployee(Joe);
		corp.addEmployee(Jay);
		corp.showSalaries();		
	}

}
