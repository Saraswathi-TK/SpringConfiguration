package com.xworkz.metro.entity;

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
@Table(name = "metro")
public class MetroEntity {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "distination")
	private String distination;

	@Column(name = "restRoom")
	private boolean restRoom;

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

	public String getDistination() {
		return distination;
	}

	public void setDistination(String distination) {
		this.distination = distination;
	}

	public boolean isRestRoom() {
		return restRoom;
	}

	public void setRestRoom(boolean restRoom) {
		this.restRoom = restRoom;
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
		return "MetroEntity [id=" + id + ", name=" + name + ", distination=" + distination + ", restRoom=" + restRoom
				+ ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public MetroEntity(int id, String name, String distination, boolean restRoom, LocalTime checkInTime,
			LocalTime checkOutTime, String createdBy, LocalDate createdDate, LocalDate updatedDate) {
		super();
		this.id = id;
		this.name = name;
		this.distination = distination;
		this.restRoom = restRoom;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public MetroEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
