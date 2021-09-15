package data_operation;

public class AccountingArrayApp {
    public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
    
	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		double vat = getVAT();
		double total = getTotal();
		double expense = getExpense();
		double income = getIncome();

		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total :" + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		
		double [] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
				
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : " + (income * dividendRates[i]) );
			i = i + 1;
		}
		
		
	}

	private static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply * expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
