package com.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.inti.service.interfaces.IFactureService;

@RestController
@CrossOrigin
public class FactureController {
	@Autowired
	IFactureService factureService;
}
