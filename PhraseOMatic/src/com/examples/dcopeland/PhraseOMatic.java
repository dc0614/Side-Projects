package com.examples.dcopeland;

public class PhraseOMatic {

	public static void main(String[] args) {
		String[] wordListOne = {"a 24/7", "a love at first sight", "a young and restless", "a hungry",
				"more advancement", "is the courage", "a put people first", "our humanity", "the bottom line", "our profits",
				"a time is money attitude"
		};
		
		String[] wordListTwo = {"who wants it more", "time is money", "complicated", "think big", "be the change", 
				"critical", "focused", "intensity is rising", "networked", "task-oriented", "shared", "filed", "power", 
				"filtered", "damaged", "severe wounds", "action-packed agenda", "flaming feathers", "hope for more"
				};
		
		String[] wordListThree = {"documented process", "focused agenda", "political agenda", "timeless efforts",
				"valuable strategy", "journey through time", "complicated solutions", "critical paths", "personal data", 
				"trusted partnership"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		System.out.println("What we need is " + phrase + ".");
		
		
	}
}