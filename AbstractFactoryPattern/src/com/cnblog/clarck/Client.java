package com.cnblog.clarck;

public class Client {
	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		
		//IFactory factory = new SqlserverFactory();
		IFactory factory = new AccessFactory();
		
		IUser iu = factory.createUser();
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment iDepartment = factory.createDepartment();
		iDepartment.insert(department);
		iDepartment.getDepartment(1);
	}
}
