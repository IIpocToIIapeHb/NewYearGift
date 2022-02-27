package by.home.new_year_gift.main;

import java.util.ArrayList;

import java.util.List;

import by.home.new_year_gift.entity.AbstractSweet;
import by.home.new_year_gift.entity.ChocolateBar;
import by.home.new_year_gift.entity.ChocolateSweet;
import by.home.new_year_gift.entity.GiftCalculator;
import by.home.new_year_gift.entity.GiftPrinter;
import by.home.new_year_gift.entity.Lolipop;
import by.home.new_year_gift.entity.NewYearGift;
import by.home.new_year_gift.entity.Taste;
import by.home.new_year_gift.entity.BarType;
import by.home.new_year_gift.entity.ChocolateType;

public class Main {
	public static void main(String[] args) {

		NewYearGift gift = new NewYearGift();

		gift.addSweet(new Lolipop("ChupaChups", 20, 1, Taste.ORANGE, true));
		gift.addSweet(new Lolipop("ChupaChups", 20, 2, Taste.COLA, false));
		gift.addSweet(new Lolipop("ChupaChups", 20, 2, Taste.COLA, false));
		gift.addSweet(new ChocolateSweet("Mars", 40, 1, true, ChocolateType.DARK));
		gift.addSweet(new ChocolateSweet("Boumti", 35, 2, true, ChocolateType.WHITE));
		gift.addSweet(new ChocolateBar("AlpenGold", 200, 5, false, ChocolateType.DARK, BarType.BIG));

		
         GiftCalculator giftCalculator = new GiftCalculator(); 
         int giftWeight = giftCalculator.calculateWeight(gift);
		 System.out.println("The weight of the gift: " + giftWeight);
		 System.out.println();
		
		
		GiftPrinter giftPrinter = new GiftPrinter();
		giftPrinter.detailedGiftList(gift);
		giftPrinter.shortGiftList(gift);
	}

}

