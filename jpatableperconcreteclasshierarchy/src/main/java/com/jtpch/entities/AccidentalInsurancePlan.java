package com.jtpch.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="accidental_insurance_plan")

public class AccidentalInsurancePlan extends InsurancePlan {
	private static final long serialVersionUID = 1L;
	private int disabilityCoveragePercentage;
	private boolean internationalCoverage;
	public int getDisabilityCoveragePercentage() {
		return disabilityCoveragePercentage;
	}
	public void setDisabilityCoveragePercentage(int disabilityCoveragePercentage) {
		this.disabilityCoveragePercentage = disabilityCoveragePercentage;
	}
	public boolean isInternationalCoverage() {
		return internationalCoverage;
	}
	public void setInternationalCoverage(boolean internationalCoverage) {
		this.internationalCoverage = internationalCoverage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "AccidentalInsurancePlan [disabilityCoveragePercentage=" + disabilityCoveragePercentage
				+ ", internationalCoverage=" + internationalCoverage + ", planNo=" + planNo + ", planName=" + planName
				+ ", tenure=" + tenure + ", premiumAmount=" + premiumAmount + ", insuredAmount=" + insuredAmount
				+ ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(disabilityCoveragePercentage, internationalCoverage);
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
		AccidentalInsurancePlan other = (AccidentalInsurancePlan) obj;
		return disabilityCoveragePercentage == other.disabilityCoveragePercentage
				&& internationalCoverage == other.internationalCoverage;
	}
	
}
