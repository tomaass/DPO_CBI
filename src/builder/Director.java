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

    public ArithmeticExpression getExpressionBuilder() {
        return expressionBuilder.getExpression();
    }

    public void setExpressionBuilder(ExpressionBuilder expressionBuilder) {
        this.expressionBuilder = expressionBuilder;
    }
    
    public void buildExpression(){
        expressionBuilder.createNewArithmeticExpression();
        expressionBuilder.buildTree();
    }

}
