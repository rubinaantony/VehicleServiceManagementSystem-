package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_VEHICLE")
public class Vehicle{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VEH_SEQ")
	@SequenceGenerator(sequenceName="TBL_VEH_SEQ",allocationSize=1,name="VEH_SEQ")
	private int v_id;
	private String v_number;
	private String v_type;
	private String v_service;
	private String v_date;
	private String v_charge;
	private String v_cusname;
	private String v_mobile;
	public int getV_id() {
		return v_id;
	}
	public String getV_cusname() {
		return v_cusname;
	}
	public void setV_cusname(String v_cusname) {
		this.v_cusname = v_cusname;
	}
	public String getV_mobile() {
		return v_mobile;
	}
	public void setV_mobile(String v_mobile) {
		this.v_mobile = v_mobile;
	}
	public void setV_id(int v_id) {
		this.v_id = v_id;
	}
	public String getV_number() {
		return v_number;
	}
	public void setV_number(String v_number) {
		this.v_number = v_number;
	}
	public String getV_type() {
		return v_type;
	}
	public void setV_type(String v_type) {
		this.v_type = v_type;
	}
	public String getV_service() {
		return v_service;
	}
	public void setV_service(String v_service) {
		this.v_service = v_service;
	}
	public String getV_date() {
		return v_date;
	}
	public void setV_date(String v_date) {
		this.v_date = v_date;
	}
	public String getV_charge() {
		return v_charge;
	}
	public void setV_charge(String v_charge) {
		this.v_charge = v_charge;
	}

	
}
