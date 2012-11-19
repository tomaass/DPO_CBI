package cvut.fit.dpo.arithmetic.elements;


public class Number extends CompositeExpressionElement
{
	private Integer value;
	
	public Number(Integer value)
	{
		this.value = value;
	}
	
	@Override
	public String stringValue()
	{
		return String.valueOf(value);
	}

}
