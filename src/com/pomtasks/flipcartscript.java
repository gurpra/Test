package com.pomtasks;

import com.facebookpackage.base;

public class flipcartscript extends base{

	public static void main(String[] args) {
		chromebrowser("https://www.flipkart.com/");
		flipcartpom l = new flipcartpom();
		
		hover(l.getElectronics());
	}
}
