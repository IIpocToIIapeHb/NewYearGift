package by.home.new_year_gift.entity;

import java.util.ArrayList;
import java.util.List;

public class NewYearGift {
	
	private List<AbstractSweet> sweets = new ArrayList<AbstractSweet>();

	public NewYearGift() {
	}

	public List<AbstractSweet> getSweets(){
		return sweets;
	}
	
	public void addSweet(AbstractSweet abstractSweet) {
		sweets.add(abstractSweet);
	}
	

}
