package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.inti.service.interfaces.IClientService;

@RestController
@CrossOrigin
public class ClientController {
	@Autowired
	IClientService clientService;
}
