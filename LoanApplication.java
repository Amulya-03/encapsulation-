package com.encapsulation;

public class LoanApplication {
	
	    private String customerName;
	    private double loanAmount;
	    private double interestRate;
	    private int loanTerm;
	    private double outstandingBalance;

	    
	    public LoanApplication(String customerName, double loanAmount, double interestRate, int loanTerm) {
	        this.customerName = customerName;
	        this.loanAmount = loanAmount;
	        this.interestRate = interestRate;
	        this.loanTerm = loanTerm;
	        this.outstandingBalance = loanAmount;
	        System.out.println("Loan Application Submitted");
	    }

	    
	    public String getCustomerName() { 
	    	return customerName;
	    	}
	    
	    public void setCustomerName(String customerName) { 
	    	this.customerName = customerName; 
	    	}
	    
	    public double getLoanAmount() {
	    	return loanAmount; 
	    	}
	    
	    public void setLoanAmount(double loanAmount) { 
	    	this.loanAmount = loanAmount;
	    	}
	    
	    public double getInterestRate() {
	    	return interestRate; 
	    	}
	    
	    public void setInterestRate(double interestRate) { 
	    	this.interestRate = interestRate;
	    	}
	    
	    public int getLoanTerm() {
	    	return loanTerm; 
	    	}
	    
	    public void setLoanTerm(int loanTerm){ 
	    this.loanTerm = loanTerm; 
	    }
	    
	    public double getOutstandingBalance() {
	    	return outstandingBalance; 
	    	}
	    
	    public void setOutstandingBalance(double outstandingBalance) {
	    	this.outstandingBalance = outstandingBalance; 
	    	}

	    
	    public void makePayment(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid payment amount");
	        } 
	        else if (amount > outstandingBalance) {
	            System.out.println("Payment exceeds Loan balance");
	        }
	        else {
	            outstandingBalance -= amount;
	            System.out.println("Payment successful: " + outstandingBalance);
	        }
	    }

	    
	    public double calculateEMI() {
	        double monthlyInterestRate = interestRate / (100 * 12);
	        int loanTenureInMonths = loanTerm * 12;
	        double emi = (loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanTenureInMonths)) / (Math.pow(1 + monthlyInterestRate, loanTenureInMonths) - 1);
	        return emi;
	    }

	    // Method to display loan details
	    public void displayLoanDetails() {
	        
	        System.out.println("Total Loan Amount: " + loanAmount);
	        System.out.println("Interest Rate: " + interestRate);
	        System.out.println("EMI: " + calculateEMI());
	        System.out.println("Remaining Balance: " + outstandingBalance);
	    }

	    public static void main(String[] args) {
	        LoanApplication loan = new LoanApplication("Darshan",80000,12,6);
	        loan.displayLoanDetails();
	        loan.makePayment(20000);
	        loan.displayLoanDetails();
	    }
	}

