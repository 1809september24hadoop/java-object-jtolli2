package com.revature;

import org.apache.log4j.Logger;

import com.revature.exception.FailedThiefAttemptException;
import com.revature.object.Arsene;
import com.revature.object.CommonThug;
import com.revature.object.Robin;
import com.revature.object.Thief;

public class Driver {
	private static final Logger LOGGER = Logger.getLogger(Driver.class);
	
	public static void main(String[] args) throws FailedThiefAttemptException {
		if(args.length < 3 || args.length > 4) {
			throw new IllegalArgumentException("Input must be: story#, name, age, occupation || story#, name, age");
		}
		
		switch(args[0]) {
		case "0":
			Thief robin = new Robin(args[1], Integer.parseInt(args[2]), args[3]);
			robin.introduce();
			robin.talk();
			break;
		case "1":
			Thief thug = new CommonThug(args[1], Integer.parseInt(args[2]), args[3]);
			thug.introduce();
			thug.talk();
			break;
		case "2":
			Thief arsene = new Arsene(args[1], Integer.parseInt(args[2]), args[3]);
			arsene.introduce();
			arsene.talk();
			break;
		default:
			LOGGER.info("Invalid input for story number");
			throw new IllegalArgumentException("Input for story# must be 0-2");
		}
		
		
	}

}
