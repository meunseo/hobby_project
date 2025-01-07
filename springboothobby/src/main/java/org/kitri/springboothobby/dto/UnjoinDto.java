package org.kitri.springboothobby.dto;

public class UnjoinDto {
	private String id;
	private String mm_num;

	public UnjoinDto() {
	}

	public UnjoinDto(String id, String mm_num) {
		this.id = id;
		this.mm_num = mm_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMm_num() {
		return mm_num;
	}

	public void setMm_num(String mm_num) {
		this.mm_num = mm_num;
	}

	@Override
	public String toString() {
		return "UnjoinDto [id=" + id + ", mm_num=" + mm_num + "]";
	}

}
