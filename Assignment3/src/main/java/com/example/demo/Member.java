package com.example.demo;

import java.util.Date;
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
public class Member {
	@Id
	private String memb_Id;
	private String name;
	private String address;
	private String memb_type;
	private Date memb_date;
	private Date exiry_date;
	
	public Member() {
	}

	public Member(String memb_Id, String name, String address, String memb_type, Date memb_date, Date exiry_date) {
		this.memb_Id = memb_Id;
		this.name = name;
		this.address = address;
		this.memb_type = memb_type;
		this.memb_date = memb_date;
		this.exiry_date = exiry_date;
	}

	public String getMemb_Id() {
		return memb_Id;
	}

	public void setMemb_Id(String memb_Id) {
		this.memb_Id = memb_Id;
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

	public String getMemb_type() {
		return memb_type;
	}

	public void setMemb_type(String memb_type) {
		this.memb_type = memb_type;
	}

	public Date getMemb_date() {
		return memb_date;
	}

	public void setMemb_date(Date memb_date) {
		this.memb_date = memb_date;
	}

	public Date getExiry_date() {
		return exiry_date;
	}

	public void setExiry_date(Date exiry_date) {
		this.exiry_date = exiry_date;
	}

	@Override
	public String toString() {
		return "Member (memb_Id=" + memb_Id + ", name=" + name + ", address=" + address + ", memb_type=" + memb_type
				+ ", memb_date=" + memb_date + ", exiry_date=" + exiry_date + ")";
	}
	
	

}