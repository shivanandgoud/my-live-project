package com.project.salarymanagementsystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salary {
	@Id
	int salary_id;
	String Designation;
    long salary;
	String Department;
	
	public Salary() {
	
	}

	public int getSalary_id() {
		return salary_id;
	}

	public void setSalary_id(int salary_id) {
		this.salary_id = salary_id;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	@Override
	public String toString() {
		return "Salary [salary_id=" + salary_id + ", Designation=" + Designation + ", salary=" + salary
				+ ", Department=" + Department + "]";
	}
	

}
