package com.xworkz.ott.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ContanctController {

	public ContanctController() {

		System.out.println("Create ContanctController");
	}

	@RequestMapping("/contanct.do")
	public String onContanct() {
		System.out.println("create onContenct");
		return "contanct.html";
	}

}
