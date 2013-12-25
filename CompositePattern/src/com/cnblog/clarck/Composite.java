package com.cnblog.clarck;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> children = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void display(int depth) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < depth; i ++) {
			stringBuilder.append("-");
		}
		System.out.println(stringBuilder.append(mName).toString());
		
		for (Component component : children) {
			component.display(depth + 2);
		}
	}

}
