package tests.factory;

import entities.Financing;

public class FinancingFactory {
	
	public static Financing createAccount(Double totalAmount, Double income, Integer month) {
		return new Financing(totalAmount, income, month);
	}
}
