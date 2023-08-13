package com.jhm.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@DiscriminatorValue(value="Tractor")
@Table(name="tractor")
//@PrimaryKeyJoinColumn(name="tractor_id_no")
public class Tractor extends Vehicle {
	private static final long serialVersionUID = 1L;
	@Column(name="engine_capacity")
	private int engineCapacity;
	@Column(name="solar_support")
	private boolean solarSupport;
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public boolean isSolarSupport() {
		return solarSupport;
	}
	public void setSolarSupport(boolean solarSupport) {
		this.solarSupport = solarSupport;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Tractor [engineCapacity=" + engineCapacity + ", solarSupport=" + solarSupport + ", vehicleId="
				+ vehicleId + ", color=" + color + ", fuelType=" + fuelType + ", manufactureDate=" + manufactureDate
				+ ", manufacturerName=" + manufacturerName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(engineCapacity, solarSupport);
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
		Tractor other = (Tractor) obj;
		return engineCapacity == other.engineCapacity && solarSupport == other.solarSupport;
	}
	
	
}
