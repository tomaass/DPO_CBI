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
public class Director {
    private ExpressionBuilder expressionBuilder;

    public void setExpressionBuilder(ExpressionBuilder eb){
        expressionBuilder = eb;
    }
    
    public ArithmeticExpression getExpression(){
        return expressionBuilder.getExpression();
    }
    
    public void buildExpression(int i){
        expressionBuilder.createNewArithmeticExpression();
        expressionBuilder.build(i);
    }
            
}
