package com.cnblog.clarck;

/**
 * 叶节点对象
 * 
 * @author clarck
 * 
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("Cannot add to a leaf");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Cannot remove to a leaf");
	}

	@Override
	public void display(int depth) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < depth; i ++) {
			stringBuilder.append("-");
		}
		System.out.println(stringBuilder.append(mName).toString());
	}

}
