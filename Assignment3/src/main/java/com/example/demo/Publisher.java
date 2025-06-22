package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@Document
@ToString
public class Publisher {
	@Id
	private String pub_id;
	private String address;
	private String name;

	public Publisher() {
	}

	public Publisher(String pub_id, String address, String name) {
		this.pub_id = pub_id;
		this.address = address;
		this.name = name;
	}

	public String getPub_id() {
		return pub_id;
	}

	public void setPub_id(String pub_id) {
		this.pub_id = pub_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Publisher(pub_id=" + pub_id + ", address=" + address + ", name=" + name + ")";
	};

}