package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;

/**
 * Represents + operation
 * 
 * @author Jan Kurš
 * 
 */
public class AddOperator extends BinaryOperator
{

    public AddOperator(CompositeExpressionElement firstOperand, CompositeExpressionElement secondOperand) {
        super(firstOperand, secondOperand);
    }

    

	@Override
	protected Integer evaluate(Integer val1, Integer val2)
	{
		return val1 + val2;
	}

}
