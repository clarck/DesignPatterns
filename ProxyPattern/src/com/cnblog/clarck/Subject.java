package com.cnblog.clarck;

/**
 * Subject 类，定义了RealSubject和Proxy的共用接口， 这样就在任何使用RealSubject的地饭都可以使用Proxy
 * 
 * @author clarck
 * 
 */
public abstract class Subject {
	public abstract void request();
}
