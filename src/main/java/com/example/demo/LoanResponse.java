package com.example.demo;

public class LoanResponse {
	
	int approvedAmount;
	
	boolean status;

	public int getApprovedAmount() {
		return approvedAmount;
	}

	public void setApprovedAmount(int approvedAmount) {
		this.approvedAmount = approvedAmount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LoanResponse(int approvedAmount, boolean status) {
		super();
		this.approvedAmount = approvedAmount;
		this.status = status;
	}
	

}
