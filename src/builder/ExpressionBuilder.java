/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import cvut.fit.dpo.arithmetic.ArithmeticExpression;

/**
 *
 * @author Maty
 */
public abstract class ExpressionBuilder {
    protected ArithmeticExpression expression;

    public ArithmeticExpression getExpression() {
        return expression;
    }
    
    public void createNewArithmeticExpression(){
        expression = new ArithmeticExpression();
    }

    public abstract void buildTree();  
    
    
}
