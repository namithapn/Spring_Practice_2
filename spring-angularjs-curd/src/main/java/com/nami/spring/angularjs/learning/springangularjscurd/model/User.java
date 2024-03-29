package com.nami.spring.angularjs.learning.springangularjscurd.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
 
@Entity
@Table(name="APP_USER")
public class User implements Serializable{
 
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
 
    @NotEmpty
    @Column(name="NAME", nullable=false)
    private String name;
 
    @Column(name="AGE", nullable=false)
    private Integer age;
 
    @Column(name="SALARY", nullable=false)
    private double salary;

    
    
    
	public User() {
		super();
	}

	public User(@NotEmpty String name, Integer age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("User [id=%s, name=%s, age=%s, salary=%s]", id, name, age, salary);
	}
 
// getter/setter omitted to save space
    
    
    
}