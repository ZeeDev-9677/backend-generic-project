package com.controller.dummy;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dto.dummy.AddDto;

@RestController
public class DummyTest {
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String AddMess() {
		
//		ModelMapper mm=new ModelMapper();
//		AddDto ad=new AddDto();
//		AddDto a=modelMapper.map(ad.equals(ad), AddDto.class);
		return null;
	}

}
