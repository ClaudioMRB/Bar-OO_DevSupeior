package entities;

public class Bill {

	Double ticket1 = 8.00;
	Double ticket2 = 10.00;
	Double beer = 5.00;
	Double barbecue = 7.00;
	Double softDrink = 3.00;
	Double couver = 4.00;
	private Double quantBeer = 0.0;
	private Double quantBarbecue = 0.0;
	private Double quantSoftDrink = 0.0;
	public Character gender = ' ';

	public Character getGender() {
		return gender;
	}

	public void setQuantBeer(Double quantBeer) {
		this.quantBeer = quantBeer;
	}

	public Double getQuantBarbecue() {
		return quantBarbecue;
	}

	public void setQuantBarbecue(Double quantBarbecue) {
		this.quantBarbecue = quantBarbecue;
	}

	public void setQuantSoftDrink(Double quantSoftDrink) {
		this.quantSoftDrink = quantSoftDrink;
	}

	public Double getTicket1() {
		return ticket1;
	}

	public Double getTicket2() {
		return ticket2;
	}

	public Double getCouver() {
		return couver;
	}

	public Double somaProducts() {
		Double total = beer * quantBeer + barbecue * quantBarbecue + softDrink * quantSoftDrink;
		return total;

	}

}
