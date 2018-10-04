package com.examples.dcopeland.engineinterface;

public class MonsterTruck implements Engine {

	int horsePower = 0;
	public MonsterTruck(int hp) {
		super();
		// TODO Auto-generated constructor stub
		this.horsePower = hp * 500;
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
		return 8;
	}

	@Override
	public int calculateHP() {
		// TODO Auto-generated method stub
		return this.horsePower;
	}
	
	static int totalNumOfEnginesSold() {
		return numOfEngines + 1;
	}
	

}
