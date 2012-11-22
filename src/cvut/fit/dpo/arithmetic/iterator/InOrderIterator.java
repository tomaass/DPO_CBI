package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;
import java.util.ArrayList;
import java.util.Iterator;



public class InOrderIterator implements Iterator<CompositeExpressionElement>
{
    
        
   private ArrayList<CompositeExpressionElement> queue = new ArrayList<CompositeExpressionElement>(); 
   private int actual = -1;
   
   public InOrderIterator(CompositeExpressionElement root){
       inorder(root);
   } 

  
    
    private void inorder(CompositeExpressionElement node){
        if (!(node == null)){
            inorder(node.getChild().get(0));
            queue.add(node);
            inorder(node.getChild().get(1));
        }
    }
    @Override
    public boolean hasNext() {
        return (actual != queue.size()-1);
    }

    @Override
    public CompositeExpressionElement next() {
        actual++;
        return queue.get(actual);
    }    

    @Override
    public void remove() {
        queue.remove(actual);
    }
	
	

}
