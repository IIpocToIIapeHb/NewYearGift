package by.home.new_year_gift.view;

import by.home.new_year_gift.entity.AbstractSweet;
import by.home.new_year_gift.entity.NewYearGift;

public class ConsolePrinter implements Printer {

	@Override
	public void print(NewYearGift newYearGift) {
		
		for (AbstractSweet abstractSweet : newYearGift.getSweets()) {
			System.out.println("name: " + abstractSweet.getName() + " price: " + abstractSweet.getPriceInRubles());
		}

	}

}
