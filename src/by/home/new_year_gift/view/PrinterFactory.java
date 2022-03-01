package by.home.new_year_gift.view;

import java.io.FileWriter;
import java.io.IOException;

public class PrinterFactory {
	
	public Printer createPrinter(PrinterType type){
		Printer printer = null;
        switch (type) {
        //как не создавать файл с захардкожанным именем
            case FILE:
			try {
				printer = new FilePrinter(new FileWriter("Fignya poluchaetsa"));
			} catch (IOException e) {
				e.printStackTrace();
			} 
                break;
            case CONSOLE:
                printer = new ConsolePrinter();
                break;
            
            default:
                throw new IllegalArgumentException("Wrong printer type:" + type);
        }
        return printer;
	}

}
