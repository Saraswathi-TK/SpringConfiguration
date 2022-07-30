package com.xworkz.ott.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.ott.dto.OttDTO;

@Component
@RequestMapping("/")
public class SaveController {

	public SaveController() {

		System.out.println("Create SaveController");
	}

	@RequestMapping("/save.do")
	public String onSave(OttDTO ott) {
		System.out.println("create onSave");
		System.out.println(ott);
		return "save.html";
	}

}
