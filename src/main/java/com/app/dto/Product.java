package com.app.dto;

public class Product {

	public String id, name, item, type;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int price;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		if (price < 0)
			price = 0;
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
