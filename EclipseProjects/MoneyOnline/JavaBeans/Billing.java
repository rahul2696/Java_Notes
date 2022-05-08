package com.money.beans;

//bean class
public class Billing 
{
	//properties
	private double amount;
	private double discount;
	
	//constructor
	public Billing()
	{
		amount=0.0;
		discount=0.0;
	}
	
	//getter method to return value
	public double getDiscount() {
		return discount;
	}

	//setter method to assign value to a property
	public void setAmount(double amount) {
		this.amount = amount;
		calcDiscount();
	}
	
	//processing function
	private void calcDiscount()
	{
		if(amount>20000)
			discount=amount*13/100;
		else
			discount=amount*9/100;
	}
	

}
