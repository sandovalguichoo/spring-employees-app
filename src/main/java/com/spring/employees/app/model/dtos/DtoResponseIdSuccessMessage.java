package com.spring.employees.app.model.dtos;

public class DtoResponseIdSuccessMessage {
	
	
	private Integer id;
	private Boolean success;
	private String message;
	
	
	//-- Getters and setters
	public Integer getId() {return id;	}
	public void setId(Integer id) {this.id = id;	}
	public Boolean getSuccess() {return success;	}
	public void setSuccess(Boolean success) {this.success = success;	}
	public String getMessage() {	return message;	}
	public void setMessage(String message) {this.message = message;	}

	
	//-- Methos
	
	public DtoResponseIdSuccessMessage(Integer id, Boolean success, String message) {
		this.id = id;
		this.success = success;
		this.message = message;
	}
		
	public DtoResponseIdSuccessMessage() {
	}
	

}
