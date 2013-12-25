package com.cnblog.clarck;

/**
 * 具体主题/具体通知者
 * 
 * @author clarck
 * 
 */
public class ConcrateSubject extends Subject {
	private String mSubjectState;

	public String getSubjectState() {
		return mSubjectState;
	}

	public void setSubjectState(String mSubjectState) {
		this.mSubjectState = mSubjectState;
	}

}
