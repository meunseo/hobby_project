package org.kitri.springboothobby.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "a_hobby")
public class HobbyEntity {
	@Id
	@Column(name = "h_num")
	private String h_num;
	
	@Column(name = "h_name")
	private String h_name;

	public HobbyEntity() {}

	public HobbyEntity(String h_num, String h_name) {
		this.h_num = h_num;
		this.h_name = h_name;
	}

	public String getH_num() {
		return h_num;
	}

	public void setH_num(String h_num) {
		this.h_num = h_num;
	}

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	@Override
	public String toString() {
		return "HobbyEntity [h_num=" + h_num + ", h_name=" + h_name + "]";
	}

}
