package cvut.fit.dpo.arithmetic.elements;

import java.util.ArrayList;
import java.util.List;

public class CompositeExpressionElement implements ExpressionElement{

	
	private List<CompositeExpressionElement> child = new ArrayList<CompositeExpressionElement>();
	private CompositeExpressionElement parent;
	
	
	public CompositeExpressionElement getParent() {
		return parent;
	}

	public void setParent(CompositeExpressionElement parent) {
		this.parent = parent;
	}

	public List<CompositeExpressionElement> getChild() {
		return child;
	}
	
	public void addChild (CompositeExpressionElement newChild){
		child.add(newChild);
	}



	@Override
	public String stringValue() {
		return null;
	}
	
}
