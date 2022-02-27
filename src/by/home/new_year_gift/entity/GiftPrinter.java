package by.home.new_year_gift.entity;


public class GiftPrinter {

	public void detailedGiftList(NewYearGift newYearGift) {

		for (AbstractSweet abstractSweet : newYearGift.getSweets()) {

			int count = 0;
			for (AbstractSweet abstractSweetEquals : newYearGift.getSweets()) {
				if (abstractSweet.equals(abstractSweetEquals)) {
					count++;
					if (count == 1) {
						System.out.println(abstractSweet);
					}
				}

			}
			if (count == 1) {
				System.out.println(count + " thing");
			} else {
				System.out.println(count + " things");
			}
		}
	}

	public void shortGiftList(NewYearGift newYearGift) {
		int countChocolateSweet = 0;
		int countChocolateBar = 0;
		int countLolipop = 0;
		for (AbstractSweet abstractSweetType : newYearGift.getSweets()) {

			switch (abstractSweetType.getClass().getSimpleName()) {

			case "ChocolateSweet":
				countChocolateSweet++;
				break;
			case "ChocolateBar":
				countChocolateBar++;
				break;
			case "Lolipop":
				countLolipop++;
				break;

			}

		}
		System.out.println("----------------------------------------");
		System.out.println("ChoholoateSweets: " + countChocolateSweet);
		System.out.println("ChoholoateBars: " + countChocolateBar);
		System.out.println("Lolipops: " + countLolipop);

	}
}
