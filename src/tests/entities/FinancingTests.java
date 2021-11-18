package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;
import tests.factory.FinancingFactory;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectDataWhenValidData() {

		// Arrange
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;

		// Act
		Financing finance = FinancingFactory.createAccount(totalAmount, income, months);

		// Assert
		Assertions.assertEquals(totalAmount, finance.getTotalAmount());
		Assertions.assertEquals(income, finance.getIncome());
		Assertions.assertEquals(months, finance.getMonths());
	}

	@Test
	public void constructorShouldThrowExceptionWhenDataNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 20;

			Financing finance = FinancingFactory.createAccount(totalAmount, income, months);

		});
	}

	@Test
	public void setTotalAmountShouldUpdateValueWhenValidData() {

		Financing finance = new Financing(90000.0, 2000.0, 80);

		finance.setTotalAmount(50000.0);

		Assertions.assertEquals(50000.0, finance.getTotalAmount());

	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing finance = new Financing(100000.0, 2000.0, 80);

			finance.setTotalAmount(200000.0);

			Assertions.assertEquals(200000.0, finance.getTotalAmount());
		});
	}
	
	@Test
	public void setIncomeShoudUpdateValueWhenValidData() {
		
		Financing finance = new Financing(100000.0, 2000.0, 80);
		
		finance.setIncome(8000.0);
		finance.setMonths(20);
		

		Assertions.assertEquals(8000.0, finance.getIncome());

		
	}
	
	@Test
	public void setIncomeShoudThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Financing finance = new Financing(100000.0, 2000.0, 80);
			

			finance.setIncome(1000.0);

			Assertions.assertEquals(1000.0, finance.getIncome());
		});
	}
	

}
