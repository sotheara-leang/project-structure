package com.example.structure.base.web.message.error;

import java.util.Date;

import org.springframework.http.HttpStatus;

import com.example.structure.base.exception.ErrorCode;

public class ErrorMessage {

	private ErrorCode<?> code;
	private HttpStatus status;
	private String message;
	private Date date = new Date();
	
	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [code=" + code + ", status=" + status + ", message=" + message + ", date=" + date + "]";
	}

	public ErrorCode<?> getCode() {
		return code;
	}

	public void setCode(ErrorCode<?> code) {
		this.code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
