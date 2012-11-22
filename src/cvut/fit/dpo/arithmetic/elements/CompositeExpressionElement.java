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
    
    private List<CompositeExpressionElement> child = new ArrayList<CompositeExpressionElement>();
    private CompositeExpressionElement parent; 

    public void setParent(CompositeExpressionElement parent) {
        this.parent = parent;
    } 
    

    public List<CompositeExpressionElement> getChild() {
        return child;
    }

    public CompositeExpressionElement getParent() {
        return parent;
    }
    
    public void addChild (CompositeExpressionElement newChild){
        child.add(newChild);
    }
    
}
