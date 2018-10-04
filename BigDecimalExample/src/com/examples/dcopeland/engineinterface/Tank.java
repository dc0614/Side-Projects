package com.examples.dcopeland.engineinterface;

public class Tank implements Engine {
	
	private int horsepower = 80;
	
	public Tank(int horsepower) {
		super();
		this.horsepower = horsepower;
	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean stop() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int returnNumberOfCylinders() {
		// TODO Auto-generated method stub
		return 6;
	}
	
	public int calculateHP() {
		return this.horsepower;
	}

}
