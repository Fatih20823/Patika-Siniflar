package com.main;

public class Application {

	public static void main(String[] args) {
		
		
		Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0,false);
	    Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0,true);
	    
	    Ring r = new Ring(marc,alex , 90 , 100);
	    
	    r.run();

	}

}
