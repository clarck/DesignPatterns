package com.cnblog.clarck;

/**
 * IDepartment 接口，用于客户端访问，解除与具体数据库访问的耦合
 * 
 * @author clarck
 * 
 */
public interface IDepartment {
	public void insert(Department department);

	public Department getDepartment(int id);
}
