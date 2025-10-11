package com.myprojectdoc.docbasic.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myprojectdoc.docbasic.dao.DocBasicEntity;
import com.myprojectdoc.docbasic.service.DocBasicService;

@RestController
@CrossOrigin("*")
public class DocBasicController {
	private static final Logger logger = LogManager.getLogger(DocBasicController.class);

	@Autowired
	DocBasicService docBasicService;

	public DocBasicController() {
		logger.info("DocBasicController controller start");
	}

	// @RequestMapping(value = "/api/basic/first", consumes = "application/json")
	@RequestMapping(value = "/api/basic/first")
	public ResponseEntity<Object> first(@RequestParam(name = "password", required = false) String password,
			@RequestParam(name = "username", required = false) String username, HttpServletRequest request,
			HttpSession session) {
		logger.info("DocBasicController first start");
		HashMap<String, Object> result = new HashMap<String, Object>();
		try {
			logger.info("DocBasicController first docBasicService first");
			result = docBasicService.first(username,password);
		} catch (Exception e) {
			logger.error("DocBasicController first error ", e);
		}
		logger.info("DocBasicController first end");
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/api/basic/second")
	public ResponseEntity<Object> second(@RequestBody DocBasicEntity dbe,
			HttpServletRequest request, HttpSession session) {
		logger.info("DocBasicController first start");
		DocBasicEntity result1 = null;
		try {
			logger.info("DocBasicController first docBasicService first");
			result1 = docBasicService.second(dbe);
		} catch (Exception e) {
			logger.error("DocBasicController first error ", e);
		}
		logger.info("DocBasicController first end");
		return new ResponseEntity<Object>(result1, HttpStatus.OK);
	}
	@RequestMapping(value= "api/basic/third")
	public ResponseEntity<Object> third(@RequestParam(name="salary",required=false)Double salary,
			HttpServletRequest request,HttpSession session)
	{
		logger.info("DocBasicController third start");
		HashMap<String,Object> result3=new HashMap<String,Object>();
		try {
			logger.info("DocBasicController third docBasicService third");
			result3=docBasicService.second(salary);
		}catch(Exception e) {
			logger.error("DocBasicController third error ",e);
		}
		logger.info("DocBasicController third end");
		return new ResponseEntity<Object>(result3,HttpStatus.OK);
	}
}
