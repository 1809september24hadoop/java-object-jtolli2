package com.revature.object;

import org.apache.log4j.Logger;

import com.revature.exception.FailedThiefAttemptException;

public abstract class Thief implements Human {
	private static final Logger LOGGER = Logger.getLogger(Thief.class);
	
	protected String name;
	protected int age;
	protected String occupation;
	
	public Thief(String name, int age, String occupation) {
		super();
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	public Thief(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thief other = (Thief) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		return true;
	}

	@Override
	public void introduce() {
		if(this.occupation != null) {
			System.out.println("Hi, I am " + this.name + " and I'm " + this.age +
					" years old. I work as a" + this.occupation);
		} else {
			System.out.println("Hi, I am " + this.name + " and I'm " + this.age +
					" years old. I do not have a job.");
		}
	}
	
	@Override
	public void talk() throws FailedThiefAttemptException {
		try {
			System.out.println("The truth is that I am a thief and I have come to"
					+ " steal this program");
			throw new FailedThiefAttemptException();
		} catch (FailedThiefAttemptException e) {
			LOGGER.error("They were just not a good enough thief", e);
			System.out.println();
		} finally {
			System.out.println("THE END");
		}
		
		
	}

	@Override
	public String toString() {
		return "Thief [name=" + name + ", age=" + age + ", occupation=" + occupation + "]";
	}
	
	
	

}
