package com.bsl.Ekisan_seva.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email;
	private String password;
	private String fname;
	private String lname;
	private LocalDate dob;
	private String mobileno;
	private String adharno;
	private String city;
	private String state;
	private String profile;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String email, String password, String fname, String lname, LocalDate dob, String mobileno,
			String adharno, String city, String state, String profile) {
		super();
		this.email = email;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.mobileno = mobileno;
		this.adharno = adharno;
		this.city = city;
		this.state = state;
		this.profile =profile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}

}
