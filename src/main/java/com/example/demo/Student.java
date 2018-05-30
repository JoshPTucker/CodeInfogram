/**
 * 
 */
package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author tucke_000
 *
 */
@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

@Column(name="first_name")
private String firstname;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}


}
