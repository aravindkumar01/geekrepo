package com.heroku.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotEmpty
    private String event;

    @NotEmpty
    private String Participate1;

    @NotEmpty
    private String Participate2;

    @Column(name="Participate3")
    private String Participate3;
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getParticipate1() {
		return Participate1;
	}

	public void setParticipate1(String participate1) {
		Participate1 = participate1;
	}

	public String getParticipate2() {
		return Participate2;
	}

	public void setParticipate2(String participate2) {
		Participate2 = participate2;
	}

	public String getParticipate3() {
		return Participate3;
	}

	public void setParticipate3(String participate3) {
		Participate3 = participate3;
	}

	public String getParticipate4() {
		return Participate4;
	}

	public void setParticipate4(String participate4) {
		Participate4 = participate4;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	 @Column(name="Participate4")
    private String Participate4;
    
    @NotEmpty
    private String mail;
    
    @NotEmpty
    private String college;
    
    @NotEmpty
    private String department;
    
    @NotEmpty
    private String phone;
    
   

    
    

}
