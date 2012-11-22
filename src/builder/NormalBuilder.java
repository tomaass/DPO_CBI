/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import cvut.fit.dpo.arithmetic.*;

/**
 *
 * @author Maty
 */
public class NormalBuilder extends ExpressionBuilder{

    @Override
    public void build(int i) {
        switch(i){
            case 0:{
                this.expression = new ArithmeticExpression();
		
		NumericOperand op1 = new NumericOperand(1);
		NumericOperand op2 = new NumericOperand(2);
		NumericOperand op3 = new NumericOperand(3);
		
		BinaryOperator o1 = new SubstractOperator(op3, op1);
		BinaryOperator o2 = new AddOperator(o1, op2);
		
		this.expression.setRoot(o2);
            }
                break;
            case 1:{
                this.expression = new ArithmeticExpression();
                		
		NumericOperand op1 = new NumericOperand(1);
		NumericOperand op2 = new NumericOperand(2);
		NumericOperand op3 = new NumericOperand(3);
		
		BinaryOperator o2 = new AddOperator(op1, op2);
		BinaryOperator o1 = new SubstractOperator(op3, o2);
		
		this.expression.setRoot(o1);
            }
        }
    }
    
    @Override
    public void addNumericOperand(Integer value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addAddOperator(Object operand1, Object operand2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addSubtractOperator(Object operand1, Object operand2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
