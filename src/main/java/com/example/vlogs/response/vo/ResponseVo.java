package com.example.vlogs.response.vo;

public class ResponseVo {
	private String status;
	private String message;
	private Object Data;
	public String getStatus() {
		return status;
	}
	public String getMessage() {
		return message;
	}
	public Object getData() {
		return Data;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setData(Object data) {
		Data = data;
	}
	@Override
	public String toString() {
		return "ResponseVo [status=" + status + ", message=" + message + ", Data=" + Data + "]";
	}
	
	
}
