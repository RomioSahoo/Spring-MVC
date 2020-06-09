package com.cognizant;

public class Bill {
	
	private int consumerNo;
	private int prevRead;
	private int currRead;
	private int units;
	private int totCharge;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getConsumerNo() {
		return consumerNo;
	}
	public void setConsumerNo(int consumerNo) {
		this.consumerNo = consumerNo;
	}
	public int getPrevRead() {
		return prevRead;
	}
	public void setPrevRead(int prevRead) {
		this.prevRead = prevRead;
	}
	public int getCurrRead() {
		return currRead;
	}
	public void setCurrRead(int currRead) {
		this.currRead = currRead;
	}
	public int getUnits() {
		return getCurrRead()-getPrevRead();
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getTotCharge() {
		return (getCurrRead()-getPrevRead())*6;
	}
	public void setTotCharge(int totCharge) {
		this.totCharge = totCharge;
	} 
	
	
	

}
