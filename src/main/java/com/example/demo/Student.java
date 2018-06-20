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
	
	//How did they hear about us?
	@Column(name="Heard_about_us", length=300)
	private String hearMC;

	//	@Column(name = "dateOfBirth")
//	private String dob;
	
	@Column(name="Street_Adress")
	private String adress;
	private String aptnum;
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
	@Column(length=400)
	private String reasonUEmploy;
	
//	private int ssn;
	
	private boolean attenMcb4;
	private boolean hasDisability;
	private boolean Citizen;
	private boolean PermanentResidnetAlien;
	private boolean Employed;
	private boolean UnderEmployed;

	private boolean Pellgrant;
	private boolean FullTimeStudent;
	private boolean PartTimeStudent;
	//TAAP is Trade adjustment Assistance Program
	private boolean recTAAP;
	private boolean Veteran;
	private boolean SpouseVeteran;
	
	
	
	private boolean NatGaurd;
	private boolean MdRes;
	private boolean sixtyPlus;
	
	//Has student recieved the Greivance and Veteran forms
	private boolean recievGreiveVet;
	
	
	//Race choices
	 private boolean Hispanic;
	 private boolean AmericanIndian;
	 private boolean Asian;
	 private boolean BlackAfricanAmerican;
	 private boolean White;
	 private boolean Hawaiian;
	 
	 
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
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
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
	public String getCurrentEnroll() {
		return currentEnroll;
	}
	public void setCurrentEnroll(String currentEnroll) {
		this.currentEnroll = currentEnroll;
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
	public String getReasonUEmploy() {
		return reasonUEmploy;
	}
	public void setReasonUEmploy(String reasonUEmploy) {
		this.reasonUEmploy = reasonUEmploy;
	}
	public boolean isAttenMcb4() {
		return attenMcb4;
	}
	public void setAttenMcb4(boolean attenMcb4) {
		this.attenMcb4 = attenMcb4;
	}
	public boolean isHasDisability() {
		return hasDisability;
	}
	public void setHasDisability(boolean hasDisability) {
		this.hasDisability = hasDisability;
	}
	public boolean isCitizen() {
		return Citizen;
	}
	public void setCitizen(boolean citizen) {
		Citizen = citizen;
	}
	public boolean isPermanentResidnetAlien() {
		return PermanentResidnetAlien;
	}
	public void setPermanentResidnetAlien(boolean permanentResidnetAlien) {
		PermanentResidnetAlien = permanentResidnetAlien;
	}
	public boolean isEmployed() {
		return Employed;
	}
	public void setEmployed(boolean employed) {
		Employed = employed;
	}
	public boolean isUnderEmployed() {
		return UnderEmployed;
	}
	public void setUnderEmployed(boolean underEmployed) {
		UnderEmployed = underEmployed;
	}
	public boolean isPellgrant() {
		return Pellgrant;
	}
	public void setPellgrant(boolean pellgrant) {
		Pellgrant = pellgrant;
	}
	public boolean isFullTimeStudent() {
		return FullTimeStudent;
	}
	public void setFullTimeStudent(boolean fullTimeStudent) {
		FullTimeStudent = fullTimeStudent;
	}
	public boolean isPartTimeStudent() {
		return PartTimeStudent;
	}
	public void setPartTimeStudent(boolean partTimeStudent) {
		PartTimeStudent = partTimeStudent;
	}
	public boolean isRecTAAP() {
		return recTAAP;
	}
	public void setRecTAAP(boolean recTAAP) {
		this.recTAAP = recTAAP;
	}
	public boolean isVeteran() {
		return Veteran;
	}
	public void setVeteran(boolean veteran) {
		Veteran = veteran;
	}
	public boolean isSpouseVeteran() {
		return SpouseVeteran;
	}
	public void setSpouseVeteran(boolean spouseVeteran) {
		SpouseVeteran = spouseVeteran;
	}
	public boolean isNatGaurd() {
		return NatGaurd;
	}
	public void setNatGaurd(boolean natGaurd) {
		NatGaurd = natGaurd;
	}
	public boolean isMdRes() {
		return MdRes;
	}
	public void setMdRes(boolean mdRes) {
		MdRes = mdRes;
	}
	public boolean isSixtyPlus() {
		return sixtyPlus;
	}
	public void setSixtyPlus(boolean sixtyPlus) {
		this.sixtyPlus = sixtyPlus;
	}
	public boolean isRecievGreiveVet() {
		return recievGreiveVet;
	}
	public void setRecievGreiveVet(boolean recievGreiveVet) {
		this.recievGreiveVet = recievGreiveVet;
	}
	public boolean isHispanic() {
		return Hispanic;
	}
	public void setHispanic(boolean hispanic) {
		Hispanic = hispanic;
	}
	public boolean isAmericanIndian() {
		return AmericanIndian;
	}
	public void setAmericanIndian(boolean americanIndian) {
		AmericanIndian = americanIndian;
	}
	public boolean isAsian() {
		return Asian;
	}
	public void setAsian(boolean asian) {
		Asian = asian;
	}
	public boolean isBlackAfricanAmerican() {
		return BlackAfricanAmerican;
	}
	public void setBlackAfricanAmerican(boolean blackAfricanAmerican) {
		BlackAfricanAmerican = blackAfricanAmerican;
	}
	public boolean isWhite() {
		return White;
	}
	public void setWhite(boolean white) {
		White = white;
	}
	public boolean isHawaiian() {
		return Hawaiian;
	}
	public void setHawaiian(boolean hawaiian) {
		Hawaiian = hawaiian;
	}
	public String getHearMC() {
		return hearMC;
	}
	public void setHearMC(String hearMC) {
		this.hearMC = hearMC;
	}

	public String getAptnum() {
		return aptnum;
	}

	public void setAptnum(String aptnum) {
		this.aptnum = aptnum;
	}
}
