package com.xworkz.ott.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.ott.dao.OttDAO;
import com.xworkz.ott.dto.OttDTO;

@Component
public class OttServiceImpl implements OttService {

	@Autowired
	private OttDAO ottDao;
	@Override
	public boolean validateAndSave(OttDTO dto) {
		System.out.println("from service impl");
	    System.out.println(dto);
	    ottDao.save(dto);
		return  true;// ottDao.save(ottDto);
	}


}
