package by.home.new_year_gift.entity;

public class ChocolateBar  extends ChocolateSweet{
	private BarType size;

	public ChocolateBar(String name, int weightInGramm, int priceInRubles, boolean withFilling, ChocolateType type,
			BarType size) {
		super(name, weightInGramm, priceInRubles, withFilling, type);
		this.size = size;
	}

	public BarType getSize() {
		return size;
	}

	public void setSize(BarType size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		ChocolateBar other = (ChocolateBar) obj;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ChocolateBar: name " + super.getName() + ", weight = " + super.getWeightInGramm() + "g, price = " + super.getPriceInRubles() + " byn, withFilling = " + super.isWithFilling() + ", type = " + super.getType() + ", size=" + size;
	}

	



}
