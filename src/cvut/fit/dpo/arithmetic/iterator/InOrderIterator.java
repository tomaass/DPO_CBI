package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.BinaryOperator;
import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;
import java.util.ArrayList;
import java.util.Iterator;



public class InOrderIterator implements Iterator<CompositeExpressionElement>
{
    
        
   private ArrayList<CompositeExpressionElement> queueList;
   private int actual = -1;
   
   public InOrderIterator(CompositeExpressionElement root){
       queueList = new ArrayList<CompositeExpressionElement>(); 
       inorder(root);
       //System.out.println("Iterator: pocet prvku: "+queueList.size());
   } 

  
    
    private void inorder(CompositeExpressionElement node){
        if (!(node == null)){
            inorder(node.getFirstChild());
            queueList.add(node);
            inorder(node.getSecondChild());
        }
    }
    @Override
    public boolean hasNext() {
        return (actual != queueList.size()-1);
    }

    @Override
    public CompositeExpressionElement next() {
        actual++;
        return queueList.get(actual);
    }    

    @Override
    public void remove() {
        queueList.remove(actual);
    }
	
	

}
