package com.cnblog.clarck;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Element> elements = new ArrayList<Element>();
	
	public void attach(Element element) {
		elements.add(element);
	}
	
	public void detach(Element element) {
		elements.remove(element);
	}
	
	public void accept(Visitor vistor) {
		for (Element element : elements) {
			element.accept(vistor);
		}
	}
}
