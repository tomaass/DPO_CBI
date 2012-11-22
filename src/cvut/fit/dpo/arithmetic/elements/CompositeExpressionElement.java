/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cvut.fit.dpo.arithmetic.elements;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Talisman
 */
public class CompositeExpressionElement implements ExpressionElement{

    @Override
    public String stringValue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private CompositeExpressionElement firstChild = null;
    private CompositeExpressionElement secondChild = null;
    private CompositeExpressionElement parent = null; 

    public void setParent(CompositeExpressionElement parent) {
        this.parent = parent;
    } 

    public CompositeExpressionElement getFirstChild() {
        return firstChild;
    }

    public void setFirstChild(CompositeExpressionElement firstChild) {
        this.firstChild = firstChild;
    }

    public CompositeExpressionElement getSecondChild() {
        return secondChild;
    }

    public void setSecondChild(CompositeExpressionElement secondChild) {
        this.secondChild = secondChild;
    }
    

    

    public CompositeExpressionElement getParent() {
        return parent;
    }
    
    
    
}
