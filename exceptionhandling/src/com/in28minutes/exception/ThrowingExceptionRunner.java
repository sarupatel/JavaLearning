package com.in28minutes.exception;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount other) {
		if (!this.currency.equals(other.currency)) {
			// throw new RuntimeException("Currencies Don't Match");
			throw new CurrenciesDoNotMatchException(
					"Currencies do not match " + this.currency + " & " + other.currency);
		}
		this.amount = this.amount + other.amount;
	}

	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotMatchException extends RuntimeException {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {

	public static void main(String[] args) {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);

		amount1.add(amount2);
		System.out.println(amount1);

	}

}
