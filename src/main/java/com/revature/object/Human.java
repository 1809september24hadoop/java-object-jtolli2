package com.revature.object;

import com.revature.exception.FailedThiefAttemptException;
import com.revature.exception.MasterThiefException;

public interface Human {
	
	void introduce();
	
	void talk() throws FailedThiefAttemptException, MasterThiefException;
	
	
}
