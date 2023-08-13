package com.je.entities;

import java.time.LocalDate;
import java.util.Objects;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class BirthdayGreetings {
	private int personId;
	private String personName;
	private String fatherName;
	private String mobileNo;
	private LocalDate dob;
	private String wishes;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getWishes() {
		return wishes;
	}
	public void setWishes(String wishes) {
		this.wishes = wishes;
	}
	@Override
	public String toString() {
		return "BirthdayGreetings [personId=" + personId + ", personName=" + personName + ", fatherName=" + fatherName
				+ ", mobileNo=" + mobileNo + ", dob=" + dob + ", wishes=" + wishes + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dob, fatherName, mobileNo, personId, personName, wishes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BirthdayGreetings other = (BirthdayGreetings) obj;
		return Objects.equals(dob, other.dob) && Objects.equals(fatherName, other.fatherName)
				&& Objects.equals(mobileNo, other.mobileNo) && personId == other.personId
				&& Objects.equals(personName, other.personName) && Objects.equals(wishes, other.wishes);
	}
	
	
}
