package com.revature.object;


public class CommonThug extends Thief {

	public CommonThug(String name, int age, String occupation) {
		super(name, age, occupation);
	}

	public CommonThug(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Common Thug [name=" + name + ", age=" + age + ", occupation=" + occupation + "]";
	}
}
