/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Maty
 */
public class RPNBuilder extends ExpressionBuilder {
    private String input;

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
