package com.cnblog.clarck;

public class ConcrateHandler3 extends Handler {

	@Override
	public void handleRequest(int request) {
		if (request >= 20 && request < 30) {
			System.out.println(String.format("%s处理请求%d", this.getClass().getName(), request));
		} else if (mSuccessor != null) {
			mSuccessor.handleRequest(request);
		}
	}
	
}
