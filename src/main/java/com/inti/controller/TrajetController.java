package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.inti.service.interfaces.ITrajetService;

@RestController
@CrossOrigin
public class TrajetController {

	@Autowired
	ITrajetService trajetService;
}
