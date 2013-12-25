package com.cnblog.clarck;

public class ConcrateIteratorDesc extends Iterator {
	private ConcrateAggregate mAggregate;
	private int mCurrent = 0;

	public ConcrateIteratorDesc(ConcrateAggregate aggregate) {
		mAggregate = aggregate;
		mCurrent = aggregate.getCount() - 1;
	}

	@Override
	public Object first() {
		return mAggregate.get(mAggregate.getCount() - 1);
	}

	@Override
	public Object next() {
		Object ret = null;
		mCurrent--;
		if (mCurrent >= 0) {
			ret = mAggregate.get(mCurrent);
		}

		return ret;
	}

	@Override
	public boolean isDone() {
		return mCurrent < 0 ? true : false;
	}

	@Override
	public Object currentItem() {
		return mAggregate.get(mCurrent);
	}

}
