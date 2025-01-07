package org.kitri.springboothobby.dto;

public class HobbyDto {
	private String h_num;
	private String h_name;

	public HobbyDto() {}

	public HobbyDto(String h_num, String h_name) {
		super();
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

}
