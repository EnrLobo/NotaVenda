package model;

public class Cheese implements Product{

	private Double amount;
	private Double price;
	
	public Double getAmount() {
		return amount;
	}

	public void setAmount() {
		//Em gramas
		this.amount = 1000.0;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice() {
		//Em Reais
		this.price = 2.0;
	}

	@Override
	public void amountStock() {
		this.getAmount();
	}

	@Override
	public void valueProduct() {
		this.getPrice();
	}

}
