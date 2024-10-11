package com.ecinashik.backend.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Voters {
	
	@Id
	String id;
	
	String fullName;
	
	String village;
	
	int age;
	
	@Indexed
	int voterId;
	
	String boothName;
	
	String gender;
	
	String district;
	
	String blockNameBlockNumber;
	
	String assemblyConstituency;
	
	@Indexed
	String dob;
	
	String boothURL;
	
	String boothAddress;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getBoothName() {
		return boothName;
	}

	public void setBoothName(String boothName) {
		this.boothName = boothName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlockNameBlockNumber() {
		return blockNameBlockNumber;
	}

	public void setBlockNameBlockNumber(String blockNameBlockNumber) {
		this.blockNameBlockNumber = blockNameBlockNumber;
	}

	public String getAssemblyConstituency() {
		return assemblyConstituency;
	}

	public void setAssemblyConstituency(String assemblyConstituency) {
		this.assemblyConstituency = assemblyConstituency;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getBoothURL() {
		return boothURL;
	}

	public void setBoothURL(String boothURL) {
		this.boothURL = boothURL;
	}

	public String getBoothAddress() {
		return boothAddress;
	}

	public void setBoothAddress(String boothAddress) {
		this.boothAddress = boothAddress;
	}

	public Voters(String id, String fullName, String village, int age, int voterId, String boothName, String gender,
			String district, String blockNameBlockNumber, String assemblyConstituency, String dob, String boothURL,
			String boothAddress) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.village = village;
		this.age = age;
		this.voterId = voterId;
		this.boothName = boothName;
		this.gender = gender;
		this.district = district;
		this.blockNameBlockNumber = blockNameBlockNumber;
		this.assemblyConstituency = assemblyConstituency;
		this.dob = dob;
		this.boothURL = boothURL;
		this.boothAddress = boothAddress;
	}

	public Voters() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Voters [id=" + id + ", fullName=" + fullName + ", village=" + village + ", age=" + age + ", voterId="
				+ voterId + ", boothName=" + boothName + ", gender=" + gender + ", district=" + district
				+ ", blockNameBlockNumber=" + blockNameBlockNumber + ", assemblyConstituency=" + assemblyConstituency
				+ ", dob=" + dob + ", boothURL=" + boothURL + ", boothAddress=" + boothAddress + "]";
	}
	
	
	
	
	
	
	
	

}
