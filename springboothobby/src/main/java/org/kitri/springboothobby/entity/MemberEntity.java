package org.kitri.springboothobby.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "a_member")
public class MemberEntity {
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "nickname")
	private String nickname;
	
	@Column(name = "birth")
	private int birth;

	public MemberEntity() {	}

	public MemberEntity(String id, String password, String name, String nickname, int birth) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.nickname = nickname;
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "MemberEntity [id=" + id + ", password=" + password + ", name=" + name + ", nickname=" + nickname
				+ ", birth=" + birth + "]";
	}

}
