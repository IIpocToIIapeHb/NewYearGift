package by.home.new_year_gift.entity;

public class ChocolateSweet  extends AbstractSweet{
	private boolean withFilling;
	private ChocolateType type;

	public ChocolateSweet(String name, int weightInGramm, int priceInRubles, boolean withFilling,
			ChocolateType type) {
		super(name, weightInGramm, priceInRubles);
		this.withFilling = withFilling;
		this.type = type;
	}

	public boolean isWithFilling() {
		return withFilling;
	}

	public void setWithFilling(boolean withFilling) {
		this.withFilling = withFilling;
	}

	public ChocolateType getType() {
		return type;
	}

	public void setType(ChocolateType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + (withFilling ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChocolateSweet other = (ChocolateSweet) obj;
		if (type != other.type)
			return false;
		if (withFilling != other.withFilling)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChocolateSweet: name " + super.getName() + ", weigh t = " + super.getWeightInGramm() + "g, price = " + super.getPriceInRubles() + " byn, withFilling = " + withFilling + ", type = " + type;
	}
	
	

}
