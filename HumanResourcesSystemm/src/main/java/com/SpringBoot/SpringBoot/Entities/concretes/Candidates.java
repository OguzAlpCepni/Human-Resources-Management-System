package com.SpringBoot.SpringBoot.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok işlemleri bunlar 
@Data
@AllArgsConstructor // constructor oluşturur
@NoArgsConstructor  // parametresiz constructor oluşturur
@Entity   // sen bir entitiysin anatasyonu 
@Table(name = "candidates")  // veritabanındaki tabloyla eşleştirir
public class Candidates {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "birth_year")
	private int birtday;
}
