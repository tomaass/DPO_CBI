package cvut.fit.dpo.arithmetic.iterator;

import java.util.Iterator;

import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;
import cvut.fit.dpo.arithmetic.elements.ExpressionElement;

public class InOrderIterator implements Iterator<CompositeExpressionElement>
{
	
	private CompositeExpressionElement actual;
	
	public InOrderIterator (CompositeExpressionElement root){
		actual = root;
	}

	@Override
	public boolean hasNext()
	{
		return false;
	}

	@Override
	public CompositeExpressionElement next()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove()
	{
		// TODO Auto-generated method stub
		
	}

}
