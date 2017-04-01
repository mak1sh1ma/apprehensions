package com.metrotraffic.api.licenses.objects;

import java.util.Date;

public class LicensesEntity {
	private int id;
	private String licenseNumber;
	private String fullName;
	private String address;
	private Date birthDay;
	private String gender;
	private String nationality;
	private int licenseRestriction;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public int getLicenseRestriction() {
		return licenseRestriction;
	}
	public void setLicenseRestriction(int licenseRestriction) {
		this.licenseRestriction = licenseRestriction;
	}
}
