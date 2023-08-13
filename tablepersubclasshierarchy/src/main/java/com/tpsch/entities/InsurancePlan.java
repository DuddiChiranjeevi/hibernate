package com.tpsch.entities;

import java.io.Serializable;
import java.util.Objects;

public class InsurancePlan implements Serializable {
	private static final long serialVersionUID = 1L;
	protected int planNo;
	protected String planName;
	protected int tenure;
	protected double premiumAmount;
	protected double insuredAmount;
	protected String status;

	public int getPlanNo() {
		return planNo;
	}

	public void setPlanNo(int planNo) {
		this.planNo = planNo;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public double getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "InsurancePlan [planNo=" + planNo + ", planName=" + planName + ", tenure=" + tenure + ", premiumAmount="
				+ premiumAmount + ", insuredAmount=" + insuredAmount + ", status=" + status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(insuredAmount, planName, planNo, premiumAmount, status, tenure);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InsurancePlan other = (InsurancePlan) obj;
		return Double.doubleToLongBits(insuredAmount) == Double.doubleToLongBits(other.insuredAmount)
				&& Objects.equals(planName, other.planName) && planNo == other.planNo
				&& Double.doubleToLongBits(premiumAmount) == Double.doubleToLongBits(other.premiumAmount)
				&& Objects.equals(status, other.status) && tenure == other.tenure;
	}

}
