package cvut.fit.dpo.arithmetic.elements;


public class AddOperation extends CompositeExpressionElement
{
	@Override
	public String stringValue()
	{
		return "+";
	}

    public AddOperation(CompositeExpressionElement parent) {
        super(parent);
    }
        
}
