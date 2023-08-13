package com.hig.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_info")
public class CustomerDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cus_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int customerId;
	@Column(name = "cus_nm")
	private String customerName;
	@Column(name = "father_nm")
	private String fatherName;
	private double salary;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((fatherName == null) ? 0 : fatherName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CustomerDetails other = (CustomerDetails) obj;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (fatherName == null) {
			if (other.fatherName != null)
				return false;
		} else if (!fatherName.equals(other.fatherName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerName=" + customerName + ", fatherName="
				+ fatherName + ", salary=" + salary + "]";
	}
	
	
}
