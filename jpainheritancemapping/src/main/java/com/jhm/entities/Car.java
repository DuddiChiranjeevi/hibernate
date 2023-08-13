package com.jhm.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
//@DiscriminatorValue(value = "car")
@Table(name="car")
//@PrimaryKeyJoinColumn(name="car_id_no")
public class Car extends Vehicle {
	private static final long serialVersionUID = 1L;
	@Column(name="model_nm")
	private String modelName;
	@Column(name="fuel_capacity")
	private int fuelCapacity;
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
		
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", fuelCapacity=" + fuelCapacity + ", vehicleId=" + vehicleId
				+ ", color=" + color + ", fuelType=" + fuelType + ", manufactureDate=" + manufactureDate
				+ ", manufacturerName=" + manufacturerName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fuelCapacity, modelName);
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
		Car other = (Car) obj;
		return fuelCapacity == other.fuelCapacity && Objects.equals(modelName, other.modelName);
	}

	
}
