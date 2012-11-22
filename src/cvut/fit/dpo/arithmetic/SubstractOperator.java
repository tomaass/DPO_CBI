package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;

/**
 * Represents - operation
 * 
 * @author Jan Kurš
 */
public class SubstractOperator extends BinaryOperator
{

    public SubstractOperator(CompositeExpressionElement firstOperand, CompositeExpressionElement secondOperand) {
        super(firstOperand, secondOperand);
    }

    
@Override
    public String stringValue() {
        return "-";
    }
	

	@Override
	protected Integer evaluate(Integer val1, Integer val2)
	{
		return val1 - val2;
	}

}
