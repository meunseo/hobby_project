package org.kitri.springboothobby.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "a_memberships")
public class MembershipsEntity {
	@Id
	@Column(name = "m_num")
	private String m_num;
	
	@Column(name = "id")
	private String id;
	
	@Column(name = "hb_num")
	private String hb_num;

	public MembershipsEntity() {}

	public MembershipsEntity(String m_num, String id, String hb_num) {
		this.m_num = m_num;
		this.id = id;
		this.hb_num = hb_num;
	}

	public String getM_num() {
		return m_num;
	}

	public void setM_num(String m_num) {
		this.m_num = m_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHb_num() {
		return hb_num;
	}

	public void setHb_num(String hb_num) {
		this.hb_num = hb_num;
	}

	@Override
	public String toString() {
		return "MembershipsEntity [m_num=" + m_num + ", id=" + id + ", hb_num=" + hb_num + "]";
	}

}
