package hibernate.demo;


import  javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private int fees;

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
}
