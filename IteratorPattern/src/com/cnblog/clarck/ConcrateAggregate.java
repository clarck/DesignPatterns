package com.cnblog.clarck;

import java.util.ArrayList;
import java.util.List;

public class ConcrateAggregate extends Aggregate {
	private List<Object> mItems = new ArrayList<Object>();

	@Override
	public Iterator createIterator() {
		return new ConcrateIterator(this);
	}

	public int getCount() {
		return mItems.size();
	}

	public Object get(int index) {
		return mItems.get(index);
	}

	public void set(int index, Object value) {
		mItems.add(value);
	}
}
