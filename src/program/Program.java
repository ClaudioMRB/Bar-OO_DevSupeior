package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill product = new Bill();
		Bill sexo = new Bill();

		System.out.print("Enter the sex (M/F) ");
		sexo.gender = sc.nextLine().charAt(0);

		System.out.println();
		System.out.print("Amount of beer consumed: ");
		Double quantBeer = sc.nextDouble();
		product.setQuantBeer(quantBeer);
		System.out.print("Amount of softdrink consumed: ");
		Double quantSoftDrink = sc.nextDouble();
		product.setQuantSoftDrink(quantSoftDrink);
		System.out.print("Number of barbecue consumed: ");
		Double quantBarbecue = sc.nextDouble();
		product.setQuantBarbecue(quantBarbecue);

		Double feeding = product.somaProducts();

		// Mulher
		if (sexo.getGender() == 'F') {
			if (feeding < 30) {

				System.out.println();
				System.out.printf("\nReport: " + "\nConsumed = R$ %.2f \nCouvert = R$ %.2f \nTicket = R$ %.2f",
						feeding, product.getCouver(), product.getTicket1());

				System.out.println();
				System.out.printf("\nAmount Payable = R$ %.2f", feeding + product.getTicket1() + product.getCouver());
			} else {
				System.out.println();

				System.out.println();
				System.out.printf(
						"\nReport: " + "\nConsumed = R$ %.2f \nExempt artistic cover \nTicket = R$ %.2f", feeding,
						product.getTicket1());
				System.out.println();
				System.out.printf("\nAmount Payable = R$ %.2f", feeding + product.getTicket1());
			}
		}

		// Homem
		if (sexo.getGender() == 'M') {
			if (feeding < 30) {

				System.out.println();
				System.out.printf("\nReport: " + "\nConsumed = R$ %.2f \nCouvert = R$ %.2f \nTicket = R$ %.2f",
						feeding, product.getCouver(), product.getTicket2());

				System.out.println();
				System.out.printf("\nAmount Payable = R$ %.2f", feeding + product.getTicket2() + product.getCouver());
			} else {
				System.out.println();

				System.out.println();
				System.out.printf(
						"\nReport: " + "\nConsumed = R$ %.2f \nExempt artistic cover \nTicket = R$ %.2f", feeding,
						product.getTicket2());
				System.out.println();
				System.out.printf("\nAmount Payable = R$ %.2f", feeding + product.getTicket2());
			}
			sc.close();

		}

	}

}
