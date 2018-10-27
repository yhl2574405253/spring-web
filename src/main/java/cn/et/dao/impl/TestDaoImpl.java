package cn.et.dao.impl;

import cn.et.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public class TestDaoImpl implements TestDao {
	
	@Autowired
	private JdbcTemplate jdbc;

	public List<Map<String, Object>> queryAll() {
		String sql ="select * from info";
		return jdbc.queryForList(sql);
	}

	public List<Map<String, Object>> queryTestByContent(String name) {
		String sql ="select * from info where name like '%"+name+"%'";
		return jdbc.queryForList(sql);
	}

}
