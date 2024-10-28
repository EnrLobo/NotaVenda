package model;

public class Ham implements Product{

	private Double amount = 1000.0;
	private Double price = 1.0;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
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
