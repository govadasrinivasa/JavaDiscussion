package com.jt.teja;

import com.jt.sunil.Money;

public class SInheritanceTest {

	public static void main(String[] args) {
		Money m = new Money();
		m.setCoins(10);
		m.setNotes(100);
		
		Wallet w = new Wallet();
		w.setCoins(20);
		w.setNotes(200);
		w.setBrandname("Diesel");
		w.setNotes(500);
	}

}

// Single Inheritance
class Wallet extends Money{
	
	String brandname;

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
}