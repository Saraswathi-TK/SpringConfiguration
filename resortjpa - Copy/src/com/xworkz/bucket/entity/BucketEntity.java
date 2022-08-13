package com.xworkz.bucket.entity;

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
@Table(name = "bucket")
public class BucketEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "brand")
	private String brand;
	@Column(name = "color")
	private String color;
	@Column(name = "price")
	private float price;
	@Column(name = "type")
	private String type;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return "BucketEntity [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", type="
				+ type + ", createBy=" + createBy + ", createDate=" + createDate + ", updateBy=" + updateBy
				+ ", updateDate=" + updateDate + "]";
	}

	public BucketEntity(int id, String brand, String color, float price, String type, String createBy,
			LocalDate createDate, String updateBy, LocalDate updateDate) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
	}

	public BucketEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
