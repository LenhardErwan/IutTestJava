package net.lenhard.app;

import java.util.logging.Logger;

public class ChildrenClass extends PrimaryClass {
	private static final Logger LOGGER = Logger.getLogger(ChildrenClass.class.getName());

	public ChildrenClass() {
		super();
	}

	@Override
	public void showText() {
		LOGGER.info("Ceci est la classe enfant");
	}
	
}
