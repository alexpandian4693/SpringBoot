
package com.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {


    @Id
    private Integer empId;
    private String name;
    private String dept;
    private Integer salary;
   
    private String Location;
    private String Gender;
    private String Email;
    private Integer DOB;
    private Integer Phone;  
    private Date creationTs;

    public Date getCreationTs() {
		return creationTs;
	}

	public void setCreationTs(Date creationTs) {
		this.creationTs = creationTs;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Integer getDOB() {
		return DOB;
	}

	public void setDOB(Integer dOB) {
		DOB = dOB;
	}

	public Integer getPhone() {
		return Phone;
	}

	public void setPhone(Integer phone) {
		Phone = phone;
	}



    public Employee() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("empId=").append(empId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append(", DOB='").append(DOB).append('\''); 
        sb.append(", Gender='").append(Gender).append('\'');
        sb.append(", Phone='").append(Phone).append('\'');
        sb.append(", Email='").append(Email).append('\'');
        sb.append(", Location='").append(Location).append('\'');  



        
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    public Employee(Integer empId, String name, String dept, Integer salary, Date creationTs, String location,
			String gender, String email, Integer dOB, Integer phone) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.creationTs = creationTs;
		Location = location;
		Gender = gender;
		Email = email;
		DOB = dOB;
		Phone = phone;
	}

	public Date getTime() {
        return creationTs;
    }

    public void setTime(Date time) {
        this.creationTs = time;
    }
}
