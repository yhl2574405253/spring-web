package cn.et.dao;

import java.util.List;
import java.util.Map;

public interface TestDao {

	/**
	 * 查询所有的信息
	 * @return
	 */
	public List<Map<String, Object>> queryAll();

	/**
	 * 根据条件查询
	 * @param name
	 * @return
	 */
	public List<Map<String, Object>> queryTestByContent(String name);
	
}
