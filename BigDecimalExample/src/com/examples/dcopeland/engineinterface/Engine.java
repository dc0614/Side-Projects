package com.examples.dcopeland.engineinterface;

public interface Engine {
	static int numOfEngines = 0;
	
	boolean start();
	
	boolean stop();
	
	int returnNumberOfCylinders();
	
	int calculateHP();
	
	/**
	 * Examples of static and default methods in interfaces
	 */
	static int totalNumOfEnginesSold() {
		return numOfEngines;
	}
	
	default String engineNoise() {
		return "Vrooom, Vrooom.......SkKkKrRrRt";
	}
}
