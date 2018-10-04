package com.examples.dcopeland.engineinterface;

import java.util.List;
import java.util.ArrayList;

public class EngineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Engine> myEngines = new ArrayList<Engine>();
		
		MonsterTruck monster = new MonsterTruck(75);
		LawnMower lm = new LawnMower(30);
		Tank tank = new Tank(15);
		
		System.out.println(tank.engineNoise());
		
	}

}
