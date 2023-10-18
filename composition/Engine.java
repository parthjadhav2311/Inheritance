package com.prowings.basics.composition;

public class Engine {
	
	String name;
	boolean fuel;
	boolean engineOil;
	
	public Engine() {
		super();
	}

	public Engine(String name, boolean fuel, boolean engineOil) {
		super();
		this.name = name;
		this.fuel = fuel;
		this.engineOil = engineOil;
	}
	
	
	public boolean start() {
		{
		if(fuel && engineOil)
		{
			System.out.println("engine has started");
			return true;
		}
		else
		{
			System.out.println("engine not started");
			return false;
		}
	}
	
	
	
	
	

	}
}
