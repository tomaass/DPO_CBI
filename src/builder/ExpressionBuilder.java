/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import cvut.fit.dpo.arithmetic.ArithmeticExpression;

/**
 *
 * @author Talisman
 */
public abstract class ExpressionBuilder {
    protected ArithmeticExpression expression;

    public ArithmeticExpression getExpression() {
        return expression;
    }
    
    public abstract void addNumericOperand(Integer value);
    public abstract void addAddOperator(Object operand1, Object operand2);
    public abstract void addSubtractOperator(Object operand1, Object operand2);


    public void createNewArithmeticExpression() {
        expression = new ArithmeticExpression();
    }
}
