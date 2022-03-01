package by.home.new_year_gift.logic;

import by.home.new_year_gift.entity.AbstractSweet;
import by.home.new_year_gift.entity.NewYearGift;

public class GiftCalculator {
	
	public int calculateWeight(NewYearGift newYearGift) {
		int weight = 0;
		for (AbstractSweet abstractSweet : newYearGift.getSweets()) {
			weight += abstractSweet.getWeightInGramm();

		}

		return weight;
	}
}
