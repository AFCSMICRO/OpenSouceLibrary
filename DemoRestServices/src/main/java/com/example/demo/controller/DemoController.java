package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TransactionRequest;
import com.example.demo.dto.TransactionResponse;

@RestController
public class DemoController {

	@RequestMapping(value = "/performTxn", method = RequestMethod.POST)
	public TransactionResponse performTxn(@RequestBody TransactionRequest TransactionRequest) {
		TransactionResponse response = new TransactionResponse();
		response.setMessage("Message");
		response.setRetvalue("Retvalue");
		response.setDeviceSerialNumber("DeviceSerialNumber");
		return response;
	}

}
