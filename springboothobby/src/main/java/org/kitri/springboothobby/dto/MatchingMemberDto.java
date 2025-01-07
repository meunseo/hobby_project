package org.kitri.springboothobby.dto;

public class MatchingMemberDto {
	private String id;
	private String hb_num;

	public MatchingMemberDto() {
		super();
	}

	public MatchingMemberDto(String id, String hb_num) {
		super();
		this.id = id;
		this.hb_num = hb_num;
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
		return "MatchingMemberDto [id=" + id + ", hb_num=" + hb_num + "]";
	}

}
