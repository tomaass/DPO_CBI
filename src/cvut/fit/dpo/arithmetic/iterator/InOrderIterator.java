package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;
import java.util.Iterator;



public class InOrderIterator implements Iterator<CompositeExpressionElement>
{
    
    CompositeExpressionElement actual;
    CompositeExpressionElement root;
    boolean down = true;
    
    public InOrderIterator(CompositeExpressionElement root){
        this.root = root;
        actual = root;
    }
    @Override
    public boolean hasNext() {
        if (root.getChild().get(1)!= null){
            CompositeExpressionElement tmp = root.getChild().get(1);
            while(tmp.getChild().get(1) != null){
                tmp = tmp.getChild().get(1);
            }
            while (tmp.getChild().get(0) != null){
                tmp = tmp.getChild().get(0);
            }
            if (tmp == actual){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    @Override
    public CompositeExpressionElement next() {
        if (actual.isVisit()){
            if(actual.getParent().getChild().get(0) == actual){
                actual.getParent().setVisit(true);
                return actual.getParent();
            }
        }else{
            
        }
        
    }
    
    private CompositeExpressionElement left(CompositeExpressionElement start){
        
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
	
	

}
