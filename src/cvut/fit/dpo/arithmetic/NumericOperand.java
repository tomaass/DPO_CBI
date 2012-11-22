package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;
import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents number in the arithmetic expression
 * 
 * @author Jan Kurš
 */
public class NumericOperand extends CompositeExpressionElement{
	private Integer value;
        private InOrderIterator inIterator;
        private PostOrderIterator postIterator;

    public NumericOperand(Integer value) {

        this.value = value;
        inIterator = new InOrderIterator(this);
        postIterator = new PostOrderIterator(this);
    }
	
	
	public Integer getValue()
	{
		return value;
	}
	
	public void setValue(Integer value)
	{
		this.value = value;
	}
	
	public InOrderIterator inOrderIterator()
	{
		return inIterator;
	}

	public PostOrderIterator postOrderIterator()
	{
		return postIterator;
	}
	
}
