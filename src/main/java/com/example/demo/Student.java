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
	
	
	

//	@Column(name = "dateOfBirth")
//	private String dob;
	
	@Column(name="Street_Adress")
	private String adress;
	private String zipcode;
	private String homephone;
	
	private String State;
	private String city;
	
	private String gender;
	
	private String highestEducation;
	private String currentEnroll;
	
	private String employer;
	private String hours;
	private String salary;
	private String startdate;
	private String workPhone;
	private String reasonUEmploy;
	
//	private int ssn;
	
	private boolean attenMcb4;
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
	
	
	
	private boolean isNatGaurd;
	private boolean isMdRes;
	private boolean is60plus;
	
	private boolean recievGreiveVet;
	
	
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

//	public String getDob() {
//		return dob;
//	}
//
//	public void setDob(String dob) {
//		this.dob = dob;
//	}

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

//	public int getSsn() {
//		return ssn;
//	}
//
//	public void setSsn(int ssn) {
//		this.ssn = ssn;
//	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHighestEducation() {
		return highestEducation;
	}

	public void setHighestEducation(String highestEducation) {
		this.highestEducation = highestEducation;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public boolean isHasDisability() {
		return hasDisability;
	}

	public void setHasDisability(boolean hasDisability) {
		this.hasDisability = hasDisability;
	}

	public boolean isCitizen() {
		return isCitizen;
	}

	public void setCitizen(boolean isCitizen) {
		this.isCitizen = isCitizen;
	}

	public boolean isPermanentResidnetAlien() {
		return isPermanentResidnetAlien;
	}

	public void setPermanentResidnetAlien(boolean isPermanentResidnetAlien) {
		this.isPermanentResidnetAlien = isPermanentResidnetAlien;
	}

	public boolean isEmployed() {
		return isEmployed;
	}

	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}

	public boolean isUnderEmployed() {
		return isUnderEmployed;
	}

	public void setUnderEmployed(boolean isUnderEmployed) {
		this.isUnderEmployed = isUnderEmployed;
	}

	public boolean isPellgrant() {
		return isPellgrant;
	}

	public void setPellgrant(boolean isPellgrant) {
		this.isPellgrant = isPellgrant;
	}

	public boolean isFullTimeStudent() {
		return isFullTimeStudent;
	}

	public void setFullTimeStudent(boolean isFullTimeStudent) {
		this.isFullTimeStudent = isFullTimeStudent;
	}

	public boolean isPartTimeStudent() {
		return isPartTimeStudent;
	}

	public void setPartTimeStudent(boolean isPartTimeStudent) {
		this.isPartTimeStudent = isPartTimeStudent;
	}

	public boolean isTAAP() {
		return isTAAP;
	}

	public void setTAAP(boolean isTAAP) {
		this.isTAAP = isTAAP;
	}

	public boolean isVeteran() {
		return isVeteran;
	}

	public void setVeteran(boolean isVeteran) {
		this.isVeteran = isVeteran;
	}

	public boolean isSpouseVeteran() {
		return isSpouseVeteran;
	}

	public void setSpouseVeteran(boolean isSpouseVeteran) {
		this.isSpouseVeteran = isSpouseVeteran;
	}

	public boolean isNatGaurd() {
		return isNatGaurd;
	}

	public void setNatGaurd(boolean isNatGaurd) {
		this.isNatGaurd = isNatGaurd;
	}

	public boolean isMdRes() {
		return isMdRes;
	}

	public void setMdRes(boolean isMdRes) {
		this.isMdRes = isMdRes;
	}

	public boolean isIs60plus() {
		return is60plus;
	}

	public void setIs60plus(boolean is60plus) {
		this.is60plus = is60plus;
	}

	public boolean isHispanic() {
		return isHispanic;
	}

	public void setHispanic(boolean isHispanic) {
		this.isHispanic = isHispanic;
	}

	public boolean isAmericanIndian() {
		return isAmericanIndian;
	}

	public void setAmericanIndian(boolean isAmericanIndian) {
		this.isAmericanIndian = isAmericanIndian;
	}

	public boolean isAsian() {
		return isAsian;
	}

	public void setAsian(boolean isAsian) {
		this.isAsian = isAsian;
	}

	public boolean isBlackAfricanAmerican() {
		return isBlackAfricanAmerican;
	}

	public void setBlackAfricanAmerican(boolean isBlackAfricanAmerican) {
		this.isBlackAfricanAmerican = isBlackAfricanAmerican;
	}

	public boolean isWhite() {
		return isWhite;
	}

	public void setWhite(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public boolean isHawaiian() {
		return isHawaiian;
	}

	public void setHawaiian(boolean isHawaiian) {
		this.isHawaiian = isHawaiian;
	}

	public String getReasonUEmploy() {
		return reasonUEmploy;
	}

	public void setReasonUEmploy(String reasonUEmploy) {
		this.reasonUEmploy = reasonUEmploy;
	}

	public String getCurrentEnroll() {
		return currentEnroll;
	}

	public void setCurrentEnroll(String currentEnroll) {
		this.currentEnroll = currentEnroll;
	}

	public boolean isAttenMcb4() {
		return attenMcb4;
	}

	public void setAttenMcb4(boolean attenMcb4) {
		this.attenMcb4 = attenMcb4;
	}

	public boolean isRecievGreiveVet() {
		return recievGreiveVet;
	}

	public void setRecievGreiveVet(boolean recievGreiveVet) {
		this.recievGreiveVet = recievGreiveVet;
	}

	
}
