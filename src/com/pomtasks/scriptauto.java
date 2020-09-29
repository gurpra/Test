package com.pomtasks;

import com.facebookpackage.base;


public class scriptauto extends base {
	
	public static void main(String[] args) throws InterruptedException {
		chromebrowser("http://automationpractice.com/index.php");
		ptask1 k = new ptask1();
		
		hover(k.getWomen());
		
		click(k.getTshirt());
		click(k.getAddtocart());
		Thread.sleep(3000);
		click(k.getCheckout());
//		send(k.getEmail(), "guru@gmail.com");
//		click(k.getSubmit());
		
		
	}

}
