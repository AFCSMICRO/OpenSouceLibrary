package com.example.demo.dto;

import java.io.Serializable;

public class TransactionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private String message;

	private String retvalue;

	private String deviceSerialNumber;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRetvalue() {
		return retvalue;
	}

	public void setRetvalue(String retvalue) {
		this.retvalue = retvalue;
	}

	public String getDeviceSerialNumber() {
		return deviceSerialNumber;
	}

	public void setDeviceSerialNumber(String deviceSerialNumber) {
		this.deviceSerialNumber = deviceSerialNumber;
	}

}
