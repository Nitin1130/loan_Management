package com.user.loan_Management.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class PanDto {
	
	private int id;
	
	@NotBlank(message = "Pan number field can not be blank")
	@Size(min = 10, max = 10, message = "Pan number must be 10 characters long")
    @Pattern(regexp = "^([a-zA-Z]){5}([0-9]){4}([a-zA-Z]){1}?$")
	private String panNo;
	
	@NotBlank(message = "Name field can not be blank")
	private String name;
	
	@NotBlank(message = "Father name field can not be blank")
	private String fatherName;
	
	@NotBlank(message = "DOB field can not be blank")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Timestamp dob;
	
	@NotBlank(message = "Gender field can not be blank")
	private String gender;
	
	@NotBlank(message = "Phone number field can not be blank")
	@Pattern(regexp = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$")
	private String phoneNo;
	
	@NotBlank(message = "Email field can not be blank")
	@Pattern(regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\\\"(?:[\\\\x01-\\\\x08\\\\x0b\\\\x0c\\\\x0e-\\\\x1f\\\\x21\\\\x23-\\\\x5b\\\\x5d-\\\\x7f]|\\\\\\\\[\\\\x01-\\\\x09\\\\x0b\\\\x0c\\\\x0e-\\\\x7f])*\\\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\\\x01-\\\\x08\\\\x0b\\\\x0c\\\\x0e-\\\\x1f\\\\x21-\\\\x5a\\\\x53-\\\\x7f]|\\\\\\\\[\\\\x01-\\\\x09\\\\x0b\\\\x0c\\\\x0e-\\\\x7f])+)\\\\])")
	private String emailId;
	
	@NotBlank(message="address can not be empty")
	private String address;
	
	public PanDto() {
		super();
		
	}

	public PanDto(int id, String panNo, String name, String fatherName, Timestamp dob, String gender, String phoneNo,
			String emailId, String address) {
		super();
		this.id = id;
		this.panNo = panNo;
		this.name = name;
		this.fatherName = fatherName;
		this.dob = dob;
		this.gender = gender;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Timestamp getDob() {
		return dob;
	}

	public void setDob(Timestamp dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhone_no(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PanDto [id=" + id + ", panNo=" + panNo + ", name=" + name + ", fatherName=" + fatherName + ", dob="
				+ dob + ", gender=" + gender + ", phoneNo=" + phoneNo + ", emailId=" + emailId + ", address="
				+ address + "]";
	}
	
	
	
	
		
}

