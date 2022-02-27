package by.home.new_year_gift.entity;

public class Lolipop extends AbstractSweet {
	private Taste taste;
	private boolean withStick;

	public Lolipop(String name, int weightInGramm, int priceInRubles, Taste taste, boolean withStick) {
		super(name, weightInGramm, priceInRubles);
		this.taste = taste;
		this.withStick = withStick;
	}

	public Taste getTaste() {
		return taste;
	}

	public void setTaste(Taste taste) {
		this.taste = taste;
	}

	public boolean isWithStick() {
		return withStick;
	}

	public void setWithStick(boolean withStick) {
		this.withStick = withStick;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((taste == null) ? 0 : taste.hashCode());
		result = prime * result + (withStick ? 1231 : 1237);
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
		Lolipop other = (Lolipop) obj;
		if (taste != other.taste)
			return false;
		if (withStick != other.withStick)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lolipop: name " + super.getName() + ", weight = "  + super.getWeightInGramm() + "g, price = " + super.getPriceInRubles() + " byn, taste " + taste + ", withStick=" + withStick ;
	}
	
	
}
