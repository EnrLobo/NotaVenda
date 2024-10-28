package view;

import model.Sale;

public class Main {

	public static void main(String[] args) {

		Sale sale = new Sale();
		
		sale.sellBread(4);
		sale.sellCheese(0.3);
		sale.sellHam(0.2);
		sale.sellSoda(2);
		
		System.out.println(sale.getTotalValue());
		
	}

}
