package com.xworkz.temple.entity;

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
@Table(name = "Temple")
public class TempleEntity {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "location")
	private String location;

	@Column(name = "prasadha")
	private boolean prasadha;

	@Column(name = "checkInTime")
	private LocalTime checkInTime;

	@Column(name = "checkOutTime")
	private LocalTime checkOutTime;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "createdDate")
	private LocalDate createdDate;

	@Column(name = "updatedDate")
	private LocalDate updatedDate;

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

	public boolean isPrasadha() {
		return prasadha;
	}

	public void setPrasadha(boolean prasadha) {
		this.prasadha = prasadha;
	}

	public LocalTime getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(LocalTime checkInTime) {
		this.checkInTime = checkInTime;
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

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "TempleEntity [id=" + id + ", name=" + name + ", location=" + location + ", prasadha=" + prasadha
				+ ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public TempleEntity(int id, String name, String location, boolean prasadha, LocalTime checkInTime,
			LocalTime checkOutTime, String createdBy, LocalDate createdDate, LocalDate updatedDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.prasadha = prasadha;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public TempleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
