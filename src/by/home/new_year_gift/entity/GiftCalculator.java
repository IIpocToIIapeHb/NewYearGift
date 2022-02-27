package by.home.new_year_gift.entity;

public class GiftCalculator {
	
	public int calculateWeight(NewYearGift newYearGift) {
			int weight = 0;
			for (AbstractSweet abstractSweet : newYearGift.getSweets()) {
				weight += abstractSweet.getWeightInGramm();

			}

			return weight;
		}
	}


