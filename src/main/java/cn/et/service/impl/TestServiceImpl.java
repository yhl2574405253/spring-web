package cn.et.service.impl;

import cn.et.dao.TestDao;
import cn.et.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao dao;
	
	public List<Map<String, Object>> queryNewsByContent(String name) {
		return dao.queryTestByContent(name);
	}

	

}
