package com.tpsca.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="guest_user")

public class GuestUser extends SBOUser {
	@PrimaryKeyJoinColumn(name="guest_user_id")
	private static final long serialVersionUID = 1L;
	@Column(name="reffral_bonus")
	private double reffralBonus;
	@Column(name="daily_income")
	private double dailyIncome;
	public double getReffralBonus() {
		return reffralBonus;
	}
	public void setReffralBonus(double reffralBonus) {
		this.reffralBonus = reffralBonus;
	}
	public double getDailyIncome() {
		return dailyIncome;
	}
	public void setDailyIncome(double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dailyIncome, reffralBonus);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuestUser other = (GuestUser) obj;
		return Double.doubleToLongBits(dailyIncome) == Double.doubleToLongBits(other.dailyIncome)
				&& Double.doubleToLongBits(reffralBonus) == Double.doubleToLongBits(other.reffralBonus);
	}
	@Override
	public String toString() {
		return "GuestUser [reffralBonus=" + reffralBonus + ", dailyIncome=" + dailyIncome + ", UserId=" + UserId
				+ ", userName=" + userName + ", password=" + password + ", gender=" + gender + ", mobileNo=" + mobileNo
				+ ", emlilId=" + emlilId + ", joiningDate=" + joiningDate + ", status=" + status + "]";
	}
	 
	
}
