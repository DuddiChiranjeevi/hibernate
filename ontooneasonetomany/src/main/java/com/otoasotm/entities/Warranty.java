package com.otoasotm.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Warranty implements Serializable{
	private static final long serialVersionUID = 1L;
	private int warrantyNo;
	private java.util.Date warrantyIssuedDate;
	private int noDays;
	private String mobileNo;
	private Product product;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getWarrantyNo() {
		return warrantyNo;
	}
	public void setWarrantyNo(int warrantyNo) {
		this.warrantyNo = warrantyNo;
	}
	
	public java.util.Date getWarrantyIssuedDate() {
		return warrantyIssuedDate;
	}
	public void setWarrantyIssuedDate(java.util.Date warrantyIssuedDate) {
		this.warrantyIssuedDate = warrantyIssuedDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getNoDays() {
		return noDays;
	}
	public void setNoDays(int noDays) {
		this.noDays = noDays;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mobileNo, warrantyIssuedDate, warrantyNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Warranty other = (Warranty) obj;
		return Objects.equals(mobileNo, other.mobileNo) && Objects.equals(warrantyIssuedDate, other.warrantyIssuedDate)
				&& warrantyNo == other.warrantyNo;
	}
	@Override
	public String toString() {
		return "Warranty [warrantyNo=" + warrantyNo + ", warrantyIssuedDate=" + warrantyIssuedDate + ", noDays="
				+ noDays + ", mobileNo=" + mobileNo + "]";
	}
	
	
	
	
}
