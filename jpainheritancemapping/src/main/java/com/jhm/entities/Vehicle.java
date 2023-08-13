package com.jhm.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
@Entity
@Table(name="vehicle_info")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="vechile_type")
//@DiscriminatorValue(value = "Normal")
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@TableGenerator(name="vehicle_gen", table="vehicle_table_gen",pkColumnName = "pkName",pkColumnValue = "vehicleId",valueColumnName = "pkValue",allocationSize = 1)
public class Vehicle implements Serializable {
	private static final long serialVersionUID = -7604035480798447065L;
	@Id
	@GeneratedValue(generator ="vehicle_gen" )
	@Column(name="vehicle_id")
	protected int vehicleId;
	protected String color;
	@Column(name="fuel_type")
	protected String fuelType;
	@Column(name="manufacture_dt")
	protected LocalDate manufactureDate;
	@Column(name="manufacturer_nm")
	protected String manufacturerName;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", color=" + color + ", fuelType=" + fuelType + ", manufactureDate="
				+ manufactureDate + ", manufacturerName=" + manufacturerName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(color, fuelType, manufactureDate, manufacturerName, vehicleId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(color, other.color) && Objects.equals(fuelType, other.fuelType)
				&& Objects.equals(manufactureDate, other.manufactureDate)
				&& Objects.equals(manufacturerName, other.manufacturerName) && vehicleId == other.vehicleId;
	}
	

}
