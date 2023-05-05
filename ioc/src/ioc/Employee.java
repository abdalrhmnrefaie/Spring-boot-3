package ioc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private Long id;
	private String name;
	private Double salary;
	private Department department;
	private Department department2;
	private List<Adrress> adreess;

	private void init() {
		System.out.println("in employee init method");

	}

	private void cleanup() {
		System.out.println("in employee destory method");

	}

	public Employee(Long id, String name, Double salary, Department department, List<Adrress> adreess) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.adreess = adreess;
	}

	public void printName() {

		System.out.println(
				"my name is " + name + ":" + " salary is =" + salary + " and department is :" + department.getName());

		for (Adrress adreess : adreess) {
			System.out.println("Adresess is " + adreess.getCity() + " id is " + adreess.getId());
		}

	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	
	@Autowired
	@Qualifier("dept")
	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Adrress> getAdreess() {
		return adreess;
	}

	public void setAdreess(List<Adrress> adreess) {
		this.adreess = adreess;
	}

	public Department getDepartment2() {
		return department2;
	}
	@Autowired
	@Qualifier("dept1")
	public void setDepartment2(Department department2) {
		this.department2 = department2;
	}
	
	
	
	
	
	
	
	

}
