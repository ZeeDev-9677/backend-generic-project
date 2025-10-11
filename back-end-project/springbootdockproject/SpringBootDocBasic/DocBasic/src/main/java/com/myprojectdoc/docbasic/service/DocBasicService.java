package com.myprojectdoc.docbasic.service;

import java.util.HashMap;

import com.myprojectdoc.docbasic.dao.DocBasicEntity;

public interface DocBasicService {
	public DocBasicEntity second(DocBasicEntity dbe);
	public HashMap<String, Object> first(String username, String password);
	public HashMap<String, Object> second(Double salary);
}
