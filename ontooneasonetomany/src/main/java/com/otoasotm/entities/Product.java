package com.otoasotm.entities;

import java.io.Serializable;
import java.util.Objects;

public class Product  implements Serializable{

	private static final long serialVersionUID = 1L;
	private int productId;
	private String productName;
	private double price;
	private String manufacturer;
	private String productCode;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", manufacturer=" + manufacturer + ", productCode=" + productCode + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(price, productCode, productId, productName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productCode, other.productCode) && productId == other.productId
				&& Objects.equals(productName, other.productName);
	}
	
	
}

