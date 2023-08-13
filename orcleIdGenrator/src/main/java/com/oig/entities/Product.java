package com.oig.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@SequenceGenerator(name = "product_seq_generator", sequenceName = "product_no_seq", allocationSize = 1)
@Data

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq_generator")
	private int productId;
	@Column(name = "product_nm")
	private String productName;
	private double price;
	
}
