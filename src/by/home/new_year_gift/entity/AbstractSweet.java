package by.home.new_year_gift.entity;

public class AbstractSweet {
	private String name;
	private int weightInGramm;
	private int priceInRubles;

	public AbstractSweet(String name, int weightInGramm, int priceInRubles) {
		this.name = name;
		this.weightInGramm = weightInGramm;
		this.priceInRubles = priceInRubles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeightInGramm() {
		return weightInGramm;
	}

	public void setWeightInGramm(int weightInGramm) {
		this.weightInGramm = weightInGramm;
	}

	public int getPriceInRubles() {
		return priceInRubles;
	}

	public void setPriceInRubles(int priceInRubles) {
		this.priceInRubles = priceInRubles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + priceInRubles;
		result = prime * result + weightInGramm;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractSweet other = (AbstractSweet) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (priceInRubles != other.priceInRubles)
			return false;
		if (weightInGramm != other.weightInGramm)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AbstractSweet [name=" + name + ", weightInGramm=" + weightInGramm + ", priceInRubles=" + priceInRubles
				+ "]";
	}

	
	
}