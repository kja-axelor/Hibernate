package hibernate.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Full_name {
	private String fname;
	private String mname;
	private String lname;
	
	
	@Override
	public String toString() {
		return "full_name [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
	}
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}
