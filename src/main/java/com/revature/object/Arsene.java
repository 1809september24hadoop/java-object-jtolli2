package com.revature.object;

import org.apache.log4j.Logger;

import com.revature.exception.FailedThiefAttemptException;
import com.revature.exception.MasterThiefException;

public class Arsene extends Thief {
	private static final Logger LOGGER = Logger.getLogger(Thief.class);

	public Arsene(String name, int age, String occupation) {
		super(name, age, occupation);
	}
	
	public Arsene(String name, int age) {
		super(name, age);
	}

	@Override
	public void talk() throws FailedThiefAttemptException {
		System.out.println("The truth is that I am a gentleman thief that goes by Arsene Lupin and I have already"
				+ " stolen this program");
		
		LOGGER.error("The program has been stolen");
		throw new MasterThiefException();
	}
	
	@Override
	public String toString() {
		return "Arsene Lupin [name=" + name + ", age=" + age + ", occupation=" + occupation + "]";
	}
}
