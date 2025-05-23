package com.encapsulation;

public class FixedDepositAccount {
	
		  private String customerName;
		  private double principalAmount;
		  private double interestRate;
		  private int duration;
		  private double maturityAmount;

		  
		  public FixedDepositAccount(String customerName, double principalAmount, double interestRate, int duration) {
		    this.customerName = customerName;
		    this.principalAmount = principalAmount;
		    this.interestRate = interestRate;
		    this.duration = duration;
		    calculateMaturityAmount();
		    System.out.println("Fixed Deposit Created Successfully");
		  }

		  
		  public String getCustomerName() { 
			  return customerName; 
			  }
		  public void setCustomerName(String customerName) 
		  { 
			  this.customerName = customerName;
			  }
		  public double getPrincipalAmount() {
			  return principalAmount; 
			  }
		  public void setPrincipalAmount(double principalAmount) {
			  this.principalAmount = principalAmount; 
			  }
		  public double getInterestRate() { 
			  return interestRate; 
			  }
		  public void setInterestRate(double interestRate) {
			  this.interestRate = interestRate; 
			  }
		  public int getDuration() {
			  return duration; 
			  }
		  public void setDuration(int duration) { 
			  this.duration = duration; 
			  }
		  public double getMaturityAmount() {
			  return maturityAmount; 
			  }
		  public void setMaturityAmount(double maturityAmount) { 
			  this.maturityAmount = maturityAmount;
			  }

		  
		  public double calculateMaturityAmount() {
		    double rate = interestRate / 100;
		    return principalAmount * Math.pow(1 + rate, duration);
		  }

		  
		  public void withdrawBeforeMaturity(int withdrawnmonths) {
		    if (duration < 1) {
		      System.out.println("Cannot withdraw before one year");
		    } 
		    else {
		      double penalty = 0.02 * maturityAmount;
		      double amountAfterPenalty = maturityAmount - penalty;
		      System.out.println("penalty: " + amountAfterPenalty);
		    }
		  }

		  

		  public static void main(String[] args) {
		    FixedDepositAccount fd=new FixedDepositAccount("Dheerav", 50000, 4, 8);
		    System.out.println(fd.calculateMaturityAmount());
		    System.out.println("maturity");
		    fd.withdrawBeforeMaturity(4);
		    
		  }
		}




