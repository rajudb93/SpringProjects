package com.sample.app.entity;

import javax.persistence.*;

@Entity

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;


	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=").append(id).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append("]");
		return builder.toString();
	}

}
