package model;

public class Sale {
	
	private Double totalValue = 0.0;
	Bread b = new Bread();
	Cheese c = new Cheese();
	Ham h = new Ham();
	Soda s = new Soda();

	public void sellBread(Integer qtd) {
		b.setAmount(b.getAmount()- qtd);
		this.totalValue += b.getPrice()*qtd;
	}
	
	public void sellCheese(Double qtd) {
		c.setAmount(c.getAmount()- qtd);
		this.totalValue += c.getPrice()*qtd;
	}
	
	public void sellHam(Double qtd) {
		h.setAmount(h.getAmount()- qtd);
		this.totalValue += h.getPrice()*qtd;
	}
	
	public void sellSoda(Integer qtd) {
		s.setAmount(s.getAmount()- qtd);
		this.totalValue += s.getPrice()*qtd;
	}

	public Double getTotalValue() {
		return totalValue;
	}
	
	
}
