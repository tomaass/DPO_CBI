package cvut.fit.dpo.arithmetic.elements;



public class SubstractOperation extends CompositeExpressionElement
{

    public SubstractOperation(CompositeExpressionElement parent) {
        super(parent);
    }
	@Override
	public String stringValue()
	{
		return "-";
	}
}
