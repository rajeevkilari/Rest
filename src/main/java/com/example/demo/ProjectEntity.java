package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="customerInfo")
public class ProjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	private String Name;
	private String city;
	private int DueAmount;

}
