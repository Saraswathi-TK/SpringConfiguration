package com.xworkz.resort.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@AllArgsConstructor
@Data
@Table(name = "resort")
public class ResortEntity {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "checkInTime")
	private Time checkInTime;
	
	@Column(name = "checkOutTime")
	private Time checkOutTime;
	
	@Column(name = "createdBy")
	private String createdBy;
	
	@Column(name ="createdDate")
	private Date createdDate;
	
	@Column(name = "owner")
	private String owner;
	
	@Column(name = "pricePerDay")
	private Double pricePerDay;
	
	@Column(name ="updateDate")
	private Date updateDate;

}
