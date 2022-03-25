package com.flightapp.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {

	@Id
	private Integer testInt;

	public Integer getTestInt() {
		return testInt;
	}

	public void setTestInt(Integer testInt) {
		this.testInt = testInt;
	}

}
