package com.facebookpackage;

public class scriptfacebook extends base{

	public static void main(String[] args) {
		chromebrowser("https://www.facebook.com/");
		
		pomclass l = new pomclass();
		send(l.getTxtFirstName(), "guru");
		send(l.getTxtLastName(), "dheena");
		send(l.getEmail(), "dheena@gmil.com");
		send(l.getReemail(), "dheena@gmil.com");
		send(l.getTxtPass(), "jafkjas");
	
	selectbyvalue(l.getDrpday(), "25");
	selectbytxt(l.getDrpmonth(), "may");
	selectbyvalue(l.getDrpYear(), "1996");
		
	}
	
}
