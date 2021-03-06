/**
 *
 */
package com.example.demo.models;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Collection;

/**
 * @author tucke_000
 *
 */
@Entity
public class Student {
	//Values do not include ssn or dob for security
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank
	@Size(min=1, max=20)
	@Column(name = "first_name")
	private String firstname;

	@NotBlank
	@Size(min=1, max=30)
	@Column(name = "last_name")
	private String lastname;

	@Size(max = 1)
	@Column(name="middle_initial")
	private String middleInitial;
	@NotBlank
	@Email
	@Column(name = "email")
	private String email;

	@Column(name = "studentid")
	private String studentId;

	//How did they hear about us?
	@Column(name="Heard_about_us", length=300)
	private String hearMC;

	@NotBlank
	@Size(min=1, max=200)
	@Column(name="Street_Address")
	private String address;

	private String aptnum;
	@NotBlank
	private String zipcode;
	@NotBlank
	private String homephone;

	@NotBlank
	@Size(max=2)
	private String State;
	@NotBlank
	private String city;
	@NotNull
	private String gender;
	@NotBlank
	private String highestEducation;
	@NotBlank
	private String currentEnroll;
	@Size(max=150)
	private String employer;

	@Size(max=3)
	private String hours;
	private String salary;
		
	private String startdate;
	private String workPhone;
	private String fax;

	//Reason for UnderEmployment
	@Column(length=400)
	private String reasonUEmploy;
	//Has attended Montgomery College Before
	@NotNull
	private boolean attenMcb4;

	@NotNull
	private boolean hasDisability;
	@NotNull
	private boolean Citizen;
	//Is Student a permanent Resident Alien
	@NotNull
	private boolean PermanentResidnetAlien;
	//Is student Currently Employed
	@NotNull
	private boolean Employed;
	//If student is employed are the under employed
	@NotNull
	private boolean UnderEmployed;
	//Is the student elligible for the pll grant
	@NotNull
	private boolean Pellgrant;
	@NotNull
	private boolean FullTimeStudent;
	@NotNull
	private boolean PartTimeStudent;

	//TAAP is Trade adjustment Assistance Program
	@NotNull
	private boolean recTAAP;
	@NotNull
	private boolean Veteran;

	//Branch of Military Service
	private String servBranch;
	private String dateDischarge;
	private String typeDischarge;

	@NotNull
	private boolean SpouseVeteran;

	// is member of the MD national gaurd
	@NotNull
	private boolean NatGaurd;

	//Is a maryland resident
	@NotNull
	private boolean MdRes;

	//Is sixty years of age or older
	@NotNull
	private boolean sixtyPlus;

	//Has the student received the Grievance and Veteran forms
	@NotNull
	private boolean recievGreiveVet;

	//Race or ethnicity choices, true or false
	private boolean Hispanic;
	private boolean AmericanIndian;
	private boolean Asian;
	private boolean BlackAfricanAmerican;
	private boolean White;
	private boolean Hawaiian;

	@Size(min=1, max=4)
	@ManyToMany()
	private Collection<Course> courses;

	public Student() {
		//this.courseSet = new HashSet<>();
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String adress) {
		this.address = adress;
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
		this.State = state;
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

	public String getServBranch() {
		return servBranch;
	}

	public void setServBranch(String servBranch) {
		this.servBranch = servBranch;
	}

	public String getDateDischarge() {
		return dateDischarge;
	}

	public void setDateDischarge(String dateDischarge) {
		this.dateDischarge = dateDischarge;
	}

	public String getTypeDischarge() {
		return typeDischarge;
	}

	public void setTypeDischarge(String typeDischarge) {
		this.typeDischarge = typeDischarge;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}


	public Collection<Course> getCourses() {
		return courses;
	}

	public void setCourses(Collection<Course> courses) {
		this.courses = courses;
	}

	//Determines whether or not statement is true and returns yes or no
	public String boolString(boolean bool){
		String statement="";
		if(bool){
			statement="Yes";
		}else if (!bool){
			statement="no";
		}else{
			statement="Undetermined";
		}
		return statement;
	}
}
