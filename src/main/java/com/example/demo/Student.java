/**
 * 
 */
package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

/**
 * @author tucke_000
 *
 */
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "first_name")
	private String firstname;

	@Column(name = "last_name")
	private String lastname;
	
	@Column(name="middle_initial")
	private String middleInitial;

	@Column(name = "email")
	private String email;

	@Column(name = "studentid")
	private String studentId;

	@Nullable
	@Column(name = "dateOfBirth")
	private String dob;
	
	private String adress;
	private String zipcode;
	private String phone;
	private String State;
	private String city;
	private String gender;
	private String highestEducation;
	
	private String employer;
	private String hours;
	private String salary;
	private String startdate;
	
	
	private int ssn;
	
	private boolean hasDisability;
	private boolean isCitizen;
	private boolean isPermanentResidnetAlien;
	private boolean isEmployed;
	private boolean isUnderEmployed;
	private boolean isPellgrant;
	private boolean isFullTimeStudent;
	private boolean isPartTimeStudent;
	private boolean isTAAP;
	private boolean isVeteran;
	private boolean isSpouseVeteran;
	
	//Race choices
	 private boolean isHispanic;
	 private boolean isAmericanIndian;
	 private boolean isAsian;
	 private boolean isBlackAfricanAmerican;
	 private boolean isWhite;
	 private boolean isHawaiian;
	 
	 
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
