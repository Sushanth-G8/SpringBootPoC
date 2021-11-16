package com.hotelmanagement.api;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel {
	
	@Id
	private Integer id; 
	private String name;
	private String address;
	private Integer price;
	public Hotel(Integer id, String name, String address, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.price = price;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", address=" + address + ", price=" + price + "]";
	}
	
}
