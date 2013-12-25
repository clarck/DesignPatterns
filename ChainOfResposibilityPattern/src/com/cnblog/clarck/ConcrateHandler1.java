package com.cnblog.clarck;

public class ConcrateHandler1 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 0 && request < 10) {
			System.out.println(String.format("%s处理请求%d", this.getClass().getName(), request));
		} else if (mSuccessor != null) {
			mSuccessor.handleRequest(request);
		}
	}

}
