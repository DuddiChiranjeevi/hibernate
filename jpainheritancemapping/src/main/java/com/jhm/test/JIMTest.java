package com.jhm.test;

import java.time.LocalDate;

import com.jhm.entities.Car;
import com.jhm.entities.Tractor;
import com.jhm.entities.Vehicle;
import com.jhm.helper.EMFRegistry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class JIMTest {
	public static void main(String[] args) {

		EntityManagerFactory emf = null;
		EntityManager em = null;
		EntityTransaction et = null;
		boolean flag = false;
		try {

			emf=EMFRegistry.getEmfEntityManagerFactory();
			em=emf.createEntityManager();
			et=em.getTransaction();
			et.begin();
//			
//	Vehicle vehicle=new Vehicle();
//	vehicle.setColor("Blue");
//	vehicle.setFuelType("petrol");
//	vehicle.setManufactureDate(LocalDate.of(2022, 1, 14));
//	vehicle.setManufacturerName("Tata");
//	
//	em.persist(vehicle);
//	System.out.println("vechile with Id : "+vehicle.getVehicleId());
//	
//	Car car=new Car();
//	car.setColor("Silver");
//	car.setFuelType("petrol");
//	car.setManufactureDate(LocalDate.of(2022, 1, 14));
//	car.setManufacturerName("Hyundai");
//	car.setModelName("Hyundai Tucson ");
//	car.setFuelCapacity(80);
//	em.persist(car);
//	System.out.println("Car with Id : "+car.getVehicleId());
//	
//	
//	Tractor tractor=new Tractor();
//	tractor.setColor("Green");
//	tractor.setFuelType("None");
//	tractor.setManufactureDate(LocalDate.of(2022, 1, 14));
//	tractor.setManufacturerName("Sonalika");
//	tractor.setEngineCapacity(521);
//	tractor.setSolarSupport(false);
//	
//	em.persist(tractor);
//	System.out.println("Tractor with Id : "+tractor.getVehicleId());
//	
	
//	Tractor tractor=em.find(Tractor.class, 3);
//	System.out.println(tractor);
	
	Vehicle vehicle2=em.find(Vehicle.class, 2);
	System.out.println(vehicle2);
	
	flag=true;
	
		} finally {
			if (et != null) {
				if (flag) {
					et.commit();
				} else {
					et.rollback();
				}
				if (em != null) {
					em.close();
					em = null;
				}
			}
		}
		EMFRegistry.closeEntityManagerFactory();
	}
}