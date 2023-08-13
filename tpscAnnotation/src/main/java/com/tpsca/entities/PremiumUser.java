package com.tpsca.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="premium_user")

public class PremiumUser extends SBOUser  {
	@PrimaryKeyJoinColumn(name = "premium_user_id")
	private static final long serialVersionUID = 1L;
	@Column(name="daily_income")
	private double dalyIncome;
	@Column(name="intro_bonus")
	private double introBonus;
	@Column(name="comission_by_subordinates_percentage")
	private int comissionBySubordinatesPercentage;
	public double getDalyIncome() {
		return dalyIncome;
	}
	public void setDalyIncome(double dalyIncome) {
		this.dalyIncome = dalyIncome;
	}
	public double getIntroBonus() {
		return introBonus;
	}
	public void setIntroBonus(double introBonus) {
		this.introBonus = introBonus;
	}
	public int getComissionBySubordinatesPercentage() {
		return comissionBySubordinatesPercentage;
	}
	public void setComissionBySubordinatesPercentage(int comissionBySubordinatesPercentage) {
		this.comissionBySubordinatesPercentage = comissionBySubordinatesPercentage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PremiumUser [dalyIncome=" + dalyIncome + ", introBonus=" + introBonus
				+ ", comissionBySubordinatesPercentage=" + comissionBySubordinatesPercentage + ", UserId=" + UserId
				+ ", userName=" + userName + ", password=" + password + ", gender=" + gender + ", mobileNo=" + mobileNo
				+ ", emlilId=" + emlilId + ", joiningDate=" + joiningDate + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(comissionBySubordinatesPercentage, dalyIncome, introBonus);
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
		PremiumUser other = (PremiumUser) obj;
		return comissionBySubordinatesPercentage == other.comissionBySubordinatesPercentage
				&& Double.doubleToLongBits(dalyIncome) == Double.doubleToLongBits(other.dalyIncome)
				&& Double.doubleToLongBits(introBonus) == Double.doubleToLongBits(other.introBonus);
	}
	
	
	
	
}
