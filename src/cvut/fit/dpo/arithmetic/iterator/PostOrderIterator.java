package cvut.fit.dpo.arithmetic.iterator;

import cvut.fit.dpo.arithmetic.elements.CompositeExpressionElement;
import java.util.ArrayList;
import java.util.Iterator;

public class PostOrderIterator implements Iterator<CompositeExpressionElement> {

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
    public CompositeExpressionElement next() {
        actual++;
        return queue.get(actual);
    }

    @Override
    public void remove() {
        queue.remove(actual);

    }
}
