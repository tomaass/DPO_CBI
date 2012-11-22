package cvut.fit.dpo.arithmetic;

import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;

import cvut.fit.dpo.arithmetic.iterator.InOrderIterator;
import cvut.fit.dpo.arithmetic.iterator.PostOrderIterator;
import java.util.Iterator;

public class ArithmeticExpression extends CompositeExpressionElement
{
	private BinaryOperator root;
        private InOrderIterator inIterator = new InOrderIterator(root);
        private PostOrderIterator postIterator = new PostOrderIterator(root);

    public ArithmeticExpression(BinaryOperator root) {
        this.root = root;
    }

    public ArithmeticExpression() {
        
    }     
      
	public Integer evaluate()
	{
		return root.evaluate();
	}
	
	public void setRoot(BinaryOperator root)
	{
		this.root = root;
	}

	/**
	 * {@link #root} field getter.
	 * 
	 * @deprecated Do not provide access to the inner representation
	 */
	public BinaryOperator getRoot()
	{
		return root;
	}
	
	/**
	 * Should be implemented.
	 * 
	 * @return
	 */
	public InOrderIterator getInOrderIterator()
	{
            return inIterator;
	}

	/**
	 * Should be implemented
	 * 
	 * TODO
	 * 
	 * @return
	 */
	public PostOrderIterator getPostOrderIterator()
	{
		return postIterator;
	}

}
