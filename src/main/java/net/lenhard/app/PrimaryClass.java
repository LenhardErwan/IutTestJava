package net.lenhard.app;

import java.util.logging.Logger;

public class PrimaryClass {

	public PrimaryClass() {
		super();
	}

	public void showText() {
		Logger.getLogger(PrimaryClass.class.getName()).info("Ceci est la classe principale");
	}
	
}
