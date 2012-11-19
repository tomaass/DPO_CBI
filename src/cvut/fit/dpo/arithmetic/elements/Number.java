package cvut.fit.dpo.arithmetic.elements;


public class Number extends CompositeExpressionElement
{

    public Number(Integer value, CompositeExpressionElement parent) {
        super(parent);
        this.value = value;
    }
	private Integer value;
	
	
	
	@Override
	public String stringValue()
	{
		return String.valueOf(value);
	}

}
