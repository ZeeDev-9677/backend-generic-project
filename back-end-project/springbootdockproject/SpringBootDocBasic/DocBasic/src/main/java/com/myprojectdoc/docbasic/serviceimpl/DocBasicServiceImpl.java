package com.myprojectdoc.docbasic.serviceimpl;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojectdoc.docbasic.dao.DocBasicEntity;
import com.myprojectdoc.docbasic.dao.DocBasicRepository;
import com.myprojectdoc.docbasic.service.DocBasicService;

@Service
public class DocBasicServiceImpl implements DocBasicService {

	private static final Logger logger = LogManager.getLogger(DocBasicServiceImpl.class);

	@Autowired
	DocBasicRepository docBasicRepository;
	
	@Override
	public HashMap<String, Object> first(String input,String input2) {
		logger.info("DocBasicServiceImpl first start");
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		logger.info("DocBasicServiceImpl DocBasicEntity");
		DocBasicEntity dbe  = new DocBasicEntity();
		
		
		
		  StringBuilder sb=new StringBuilder(input);
		  
		  //sb.reverse(); 
		  dbe.setUsername(sb.toString()); 
		  dbe.setPassword(input2);
		  result.put("input", sb);
		 
		 
		logger.info("DocBasicServiceImpl docBasicRepository save");
		docBasicRepository.save(dbe);
		logger.info("DocBasicServiceImpl first end");
		return result;
	}
	
	public DocBasicEntity second(DocBasicEntity dbe) {
		logger.info("DocBasicServiceImpl first start");
		DocBasicEntity result1 = new DocBasicEntity();
		
		logger.info("DocBasicServiceImpl DocBasicEntity");
		
		
		logger.info("DocBasicServiceImpl docBasicRepository save");
		docBasicRepository.save(dbe);
		logger.info("DocBasicServiceImpl first end");
		return dbe;
	}

	@Override
	public HashMap<String, Object> second(Double input3) {
		
		logger.info("DocBasicServiceImpl third start");
		HashMap<String,Object> result3=new HashMap<String,Object>();
		logger.info("DocBasicServiceImpl DocBasicEntity");
		DocBasicEntity db=new DocBasicEntity();
		
		db.setSalary(input3);
		result3.put("input3", db);
		logger.info("DocBasicServiceImpl docBasicRepository save");
		docBasicRepository.save(db);
		logger.info("DocBasicServiceImpl third end");
		return result3;
	}

}
