package com.revature.object;


public class Robin extends Thief {

	public Robin(String name, int age, String occupation) {
		super(name, age, occupation);
	}

	public Robin(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void talk() {
		System.out.println("The truth is that I am a thief who steals for the poor"
				+ " and I would never steal this program from you");
		System.out.println("THE END");
	}
	
	@Override
	public String toString() {
		return "Robin Hood [name=" + name + ", age=" + age + ", occupation=" + occupation + "]";
	}
}
