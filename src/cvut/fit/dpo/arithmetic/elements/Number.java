package cvut.fit.dpo.arithmetic.elements;


public class Number extends CompositeExpressionElement
{

    public Number(Integer value) {
       
        this.value = value;
    }
	private Integer value;
	
	
	
	@Override
	public String stringValue()
	{
		return String.valueOf(value);
	}

}
