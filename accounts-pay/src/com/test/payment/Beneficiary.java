package com.test.payment;

public class Beneficiary {
	
	private String name;
	private String pix;
	private String account;
	
	public Beneficiary(String name, String pix, String account) {
		this.name = name;
		this.pix = pix;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPix() {
		return pix;
	}

	public void setPix(String pix) {
		this.pix = pix;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	public boolean hasntPix() {
		return getPix() == null || getPix().isEmpty();
	}
	
	public boolean hasntAccount() {
		return getAccount() == null || getAccount().isEmpty();
	}
}
