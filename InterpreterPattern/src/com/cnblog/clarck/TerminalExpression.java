package com.cnblog.clarck;

public class TerminalExpression extends AbstractExpression {

	@Override
	public void Interpreter(Context context) {
		System.out.println("终端解释器");
	}

}
