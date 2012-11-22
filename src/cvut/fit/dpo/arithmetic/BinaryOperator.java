package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;
import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;

/**
 * Represents the Binary operations like + - etc.
 * 
 * @author Jan Kurš
 *
 */
public abstract class BinaryOperator extends CompositeExpressionElement
{
	

	protected abstract Integer evaluate(Integer val1, Integer val2);
        private InOrderIterator inIterator = new InOrderIterator(this);
        private PostOrderIterator postIterator = new PostOrderIterator(this);

    public BinaryOperator(CompositeExpressionElement firstOperand, CompositeExpressionElement secondOperand) {       
        this.getChild().add(firstOperand);
        this.getChild().add(secondOperand);        
    }
        
        
	
	//public BinaryOperator(Object firstOperand, Object secondOperand)
	//{
		//setFirstOperand(firstOperand);
		//setSecondOperand(secondOperand);
	//}
	
//	void setFirstOperand(CompositeExpressionElement o)
//	{
//            if (this.getChild().isEmpty())
//	}
//	void setSecondOperand(CompositeExpressionElement o)
//	{
            
//	}
	
	public CompositeExpressionElement getFirstOperand()
	{
		return this.getChild().get(0);
	}
	
	public CompositeExpressionElement getSecondOperand()
	{
		return this.getChild().get(1);
	}
	
	public Integer evaluate()
	{
		int val1 = getOperandValue(this.getChild().get(0));
		int val2 = getOperandValue(this.getChild().get(1));
		
		return evaluate(val1, val2);
	}
	
	public InOrderIterator inOrderIterator()
	{
		return inOrderIterator();
	}

	public PostOrderIterator postOrderIterator()
	{
		return postIterator;
	}
	
	
	private Integer getOperandValue(Object o)
	{
		if (o instanceof NumericOperand)
		{
			return ((NumericOperand)o).getValue();
		}
		
		if (o instanceof BinaryOperator)
		{
			return ((BinaryOperator)o).evaluate();
		}
		
		throw new IllegalArgumentException("Unsuported operand type!");
	}

	
}
