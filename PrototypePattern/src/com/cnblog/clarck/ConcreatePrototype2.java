package com.cnblog.clarck;

/**
 * 要想真正拥有克隆的能力，就需要实现Cloneable接口，重写clone方法。通过克隆方法得到的对象得到的是一个本地的副本
 * 
 * @author clarck
 * 
 */
public class ConcreatePrototype2 extends Prototype implements Cloneable {

	public ConcreatePrototype2(String id) {
		super(id);
	}

	@Override
	public Prototype Clone() {
		Prototype protoType = null;
		try {
			protoType = (Prototype) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return protoType;
	}

}
