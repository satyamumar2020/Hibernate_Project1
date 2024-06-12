package com.app.hib.satyam.hib.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
private int id;
private String name;
private Double salary;


public int getId() {
	return id;
}
public String getName() {
	return name;
}
public Double getSalary() {
	return salary;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setSalary(Double salary) {
	this.salary = salary;
}


	
}
