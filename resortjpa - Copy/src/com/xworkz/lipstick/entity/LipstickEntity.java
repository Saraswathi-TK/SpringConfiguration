package com.xworkz.lipstick.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "lipstick")
public class LipstickEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "brand")
	private String brand;
	@Column(name = "price")
	private Double price;
	@Column(name = "color")
	private String color;
	@Column(name = "createBy")
	private String createBy;
	@Column(name = "createDate")
	private LocalDate createDate;
	@Column(name = "updateBy")
	private String updateBy;
	@Column(name = "updateDate")
	private LocalDate updateDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "LipstickEntity [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", createBy="
				+ createBy + ", createDate=" + createDate + ", updateBy=" + updateBy + ", updateDate=" + updateDate
				+ "]";
	}

	public LipstickEntity(int id, String brand, Double price, String color, String createBy, LocalDate createDate,
			String updateBy, LocalDate updateDate) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public LipstickEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
