package com.cnblog.clarck;

public class NonterminalExpression extends AbstractExpression {

	@Override
	public void Interpreter(Context context) {
		System.out.println("非终端解释器");
	}

}
