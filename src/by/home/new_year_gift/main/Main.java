package by.home.new_year_gift.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.home.new_year_gift.entity.AbstractSweet;
import by.home.new_year_gift.entity.ChocolateBar;
import by.home.new_year_gift.entity.ChocolateSweet;
import by.home.new_year_gift.entity.Lolipop;
import by.home.new_year_gift.entity.NewYearGift;
import by.home.new_year_gift.entity.Taste;
import by.home.new_year_gift.logic.GiftCalculator;
import by.home.new_year_gift.view.ConsolePrinter;
import by.home.new_year_gift.view.FilePrinter;
import by.home.new_year_gift.view.GiftPrinter;
import by.home.new_year_gift.view.Printer;
import by.home.new_year_gift.view.PrinterFactory;
import by.home.new_year_gift.view.PrinterType;
import by.home.new_year_gift.entity.BarType;
import by.home.new_year_gift.entity.ChocolateType;

public class Main {
	public static void main(String[] args) throws IOException {

		NewYearGift gift = new NewYearGift();

		gift.addSweet(new Lolipop("ChupaChups", 20, 1, Taste.ORANGE, true));
		gift.addSweet(new Lolipop("ChupaChups", 20, 2, Taste.COLA, false));
		gift.addSweet(new Lolipop("ChupaChups", 20, 2, Taste.COLA, false));
		gift.addSweet(new ChocolateSweet("Mars", 40, 1, true, ChocolateType.DARK));
		gift.addSweet(new ChocolateSweet("Boumti", 35, 2, true, ChocolateType.WHITE));
		gift.addSweet(new ChocolateBar("AlpenGold", 200, 5, false, ChocolateType.DARK, BarType.BIG));

		
         GiftCalculator giftCalculator = new GiftCalculator(); 
         int giftWeight = giftCalculator.calculateWeight(gift);
		 System.out.println("The weight of the gift: " + giftWeight + " g");
		 System.out.println();
		
		
		 
		 PrinterFactory factory = new PrinterFactory();
		 Printer consolePrinter= factory.createPrinter(PrinterType.FILE);
		 Printer filePrinter= factory.createPrinter(PrinterType.CONSOLE);
		 
		 
		 
			/*
			 * Printer consolePrinter= new ConsolePrinter(); consolePrinter.print(gift);
			 * 
			 * FileWriter giftFile = new FileWriter("GiftList.txt"); Printer filePrinter =
			 * new FilePrinter(giftFile); filePrinter.print(gift);
			 */
	}

}
