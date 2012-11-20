package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;
import java.util.Iterator;

import cvut.fit.dpo.arithmetic.elements.ExpressionElement;
import java.util.ArrayList;

public class PostOrderIterator implements Iterator<ExpressionElement> {

    private ArrayList<CompositeExpressionElement> queue = new ArrayList<CompositeExpressionElement>();
    private int actual = 0;

    public PostOrderIterator(CompositeExpressionElement root) {
        postorder(root);
    }

    private void postorder(CompositeExpressionElement node) {
        if (!(node == null)) {
            postorder(node.getChild().get(0));
            postorder(node.getChild().get(1));
            queue.add(node);
        }
    }

    @Override
    public boolean hasNext() {
        return (actual != queue.size() - 1);
    }

    @Override
    public ExpressionElement next() {
        actual++;
        return queue.get(actual);
    }

    @Override
    public void remove() {
        queue.remove(actual);

    }
}
