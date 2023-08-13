package com.ohm.entity;

import java.io.Serializable;
import java.time.LocalDate;
public class BabyDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	private int babyId;
	private String babyName;
	private String fatherName;
	private String motherName;
	private String gender;
	private LocalDate dob;
	public int getBabyId() {
		return babyId;
	}
	public void setBabyId(int babyId) {
		this.babyId = babyId;
	}
	public String getBabyName() {
		return babyName;
	}
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "BabyDetails [babyId=" + babyId + ", babyName=" + babyName + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", gender=" + gender + ", dob=" + dob + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + babyId;
		result = prime * result + ((babyName == null) ? 0 : babyName.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((motherName == null) ? 0 : motherName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BabyDetails other = (BabyDetails) obj;
		if (babyId != other.babyId)
			return false;
		if (babyName == null) {
			if (other.babyName != null)
				return false;
		} else if (!babyName.equals(other.babyName))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (motherName == null) {
			if (other.motherName != null)
				return false;
		} else if (!motherName.equals(other.motherName))
			return false;
		return true;
	}
	
}
