package com.examples.dcopeland.engineinterface;

public class LawnMower implements Engine {

	int horsePower = 0;
	
	public LawnMower(int hp) {
		super();
		// TODO Auto-generated constructor stub
		this.horsePower = hp * 250;
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
		return 4;
	}

	@Override
	public int calculateHP() {
		// TODO Auto-generated method stub
		return this.horsePower;
	}

}
