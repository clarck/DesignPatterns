package com.cnblog.clarck;

/**
 * 具体迭代器类
 * 
 * @author clarck
 * 
 */
public class ConcrateIterator extends Iterator {
	private ConcrateAggregate mAggregate;
	private int mCurrent = 0;

	public ConcrateIterator(ConcrateAggregate aggregate) {
		mAggregate = aggregate;
	}

	@Override
	public Object first() {
		return mAggregate.get(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		mCurrent++;
		if (mCurrent < mAggregate.getCount()) {
			ret = mAggregate.get(mCurrent);
		}

		return ret;
	}

	@Override
	public boolean isDone() {
		return mCurrent >= mAggregate.getCount() ? true : false;
	}

	@Override
	public Object currentItem() {
		return mAggregate.get(mCurrent);
	}

}
