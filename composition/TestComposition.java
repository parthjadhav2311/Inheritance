package com.prowings.basics.composition;

public class TestComposition {
	
	public static void main(String[] args) {
		
		
		Engine engine= new Engine("B12",true,true);
		Car car =new Car("bmw",2015,engine);
		
		car.startJourney();
		
	}

}
