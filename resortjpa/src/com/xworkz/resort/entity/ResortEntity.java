package com.xworkz.resort.entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

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
	private LocalTime checkInTime;
	
	@Column(name = "checkOutTime")
	private LocalTime checkOutTime;
	
	@Column(name = "createdBy")
	private String createdBy;
	
	@Column(name ="createdDate")
	private LocalDate createdDate;
	
	@Column(name = "owner")
	private String owner;
	
	@Column(name = "pricePerDay")
	private Double pricePerDay;
	
	@Column(name ="updateDate")
	private LocalDate updateDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalTime getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(LocalTime localTime) {
		this.checkInTime = localTime;
	}

	public LocalTime getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(LocalTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "ResortEntity [id=" + id + ", name=" + name + ", location=" + location + ", checkInTime=" + checkInTime
				+ ", checkOutTime=" + checkOutTime + ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", owner=" + owner + ", pricePerDay=" + pricePerDay + ", updateDate=" + updateDate + "]";
	}

	public ResortEntity(int id, String name, String location, LocalTime checkInTime, LocalTime checkOutTime, String createdBy,
			LocalDate createdDate, String owner, Double pricePerDay, LocalDate updateDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.owner = owner;
		this.pricePerDay = pricePerDay;
		this.updateDate = updateDate;
	}

	public ResortEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
