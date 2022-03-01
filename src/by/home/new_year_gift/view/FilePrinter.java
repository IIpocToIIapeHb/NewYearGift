package by.home.new_year_gift.view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import by.home.new_year_gift.entity.AbstractSweet;
import by.home.new_year_gift.entity.NewYearGift;

public class FilePrinter implements Printer {

	private FileWriter fileWriter;

	public FilePrinter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	@Override
	public void print(NewYearGift newYearGift) {
		
		try {
			
			for (AbstractSweet abstractSweet : newYearGift.getSweets()) {
				fileWriter.write("name: " + abstractSweet.getName() + "price: " + abstractSweet.getPriceInRubles());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		    try {
		    	fileWriter.close();
		    } catch (IOException ex) {
		    }
	}
	}
}

