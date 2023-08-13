package com.tpch.entities;

import java.util.Objects;

public class MedicalInsurancePlan extends InsurancePlan {
	private static final long serialVersionUID = 1L;
private int copay;
private String  coverageType;
public int getCopay() {
	return copay;
}
public void setCopay(int copay) {
	this.copay = copay;
}
public String getCoverageType() {
	return coverageType;
}
public void setCoverageType(String coverageType) {
	this.coverageType = coverageType;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(copay, coverageType);
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
	MedicalInsurancePlan other = (MedicalInsurancePlan) obj;
	return copay == other.copay && Objects.equals(coverageType, other.coverageType);
}
@Override
public String toString() {
	return "MedicalInsurancePlan [copay=" + copay + ", coverageType=" + coverageType + ", planNo=" + planNo
			+ ", planeName=" + planName + ", tenure=" + tenure + ", premiumAmount=" + premiumAmount
			+ ", insuredAmount=" + insuredAmount + ", status=" + status + "]";
}


}
