package com.encapsulation;

public class CreditCardAccount {
	    private String customerName;
	    private double creditLimit;
	    private double currentDebt;
	    private double interestRate;

	    
	    public CreditCardAccount(String customerName, double creditLimit, double currentDebt, double interestRate) {
	        this.customerName = customerName;
	        this.creditLimit = creditLimit;
	        this.currentDebt = currentDebt;
	        this.interestRate= interestRate;
	        System.out.println("Credit Card Account Created");
	    }

	    
	    public String getCustomerName() {
	    	return customerName;
	    	}
	    public void setCustomerName(String customerName) {
	    	this.customerName = customerName;
	    	}
	    public double getCreditLimit() { 
	    	return creditLimit; 
	    	}
	    public void setCreditLimit(double creditLimit) {
	    	this.creditLimit = creditLimit; 
	    	}
	    public double getCurrentDebt() {
	    	return currentDebt; 
	    	}
	    public void setCurrentDebt(double currentDebt) { 
	    	this.currentDebt = currentDebt; 
	    	}

	    
	    public void swipeCard(double amount) {
	        if (amount > creditLimit) {
	            System.out.println("Transaction declined: Limit exceeded");
	        } 
	        else {
	           
	            System.out.println("Increase currentDebt");
	        }
	    }

	    
	    public void makePayment(double amount) {
	        if (amount > currentDebt) {
	            System.out.println("Excess payment not allowed");
	        
	        }
	    }

	    
	    public void applyInterest(double interestRate) {
	        double interest = (currentDebt * interestRate) / 100;
	        currentDebt += interest;
	        System.out.println("Current debt: " + currentDebt);
	    }

	   
	    public static void main(String[] args) {
	        CreditCardAccount account = new CreditCardAccount("John", 20000,1000,0.5);
	        
	        account.swipeCard(5000);
	        account.makePayment(2000);
	        account.applyInterest(10);
	        
	    }
	}



