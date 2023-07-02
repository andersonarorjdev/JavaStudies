package com.anderson.cureency;

public class CurrencyConverter {
	public double dolarValue;
	public double quantityToBuy;
	public static int Impost = 6;
	
	
	public double calculaValorConvertido(double dolarPrice, double quantityDolarBuy){
		this.dolarValue = dolarPrice;
		this.quantityToBuy = quantityDolarBuy;
		
		return ((this.dolarValue * this.quantityToBuy) / 100) * 106 ;
	}
}
