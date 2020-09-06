package br.edu.infnet.home.broker.abc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home-broker-abc")
public class HomeBrokerService {

	@GetMapping(value = "/valores")
	public String home() {
		return "API REST em Construção";
	}
}
