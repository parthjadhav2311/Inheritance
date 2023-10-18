package com.prowings.basics.composition;

public class Car {
	
	String name;
	int year;
	Engine engine;
	
	public Car()
	{
		
	}

	public Car(String name, int year, Engine engine) {
		super();
		this.name = name;
		this.year = year;
		this.engine = engine;
	}
	
	public void startJourney()
	{    
		if(engine != null)
		{
		if(engine.start())
		{
			System.out.println("car has started");
			
		}
		else
		{
			System.out.println("car not started");
		}
	}
	
	
	
	}
}
