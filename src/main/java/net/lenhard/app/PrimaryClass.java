package net.lenhard.app;

import java.util.logging.Logger;

public class PrimaryClass {
	private static final Logger LOGGER = Logger.getLogger(PrimaryClass.class.getName());

	public PrimaryClass() {
		super();
	}

	public void showText() {
		SingletonClass instance = SingletonClass.getInstance();

		LOGGER.info("Ceci est la classe principale");
		LOGGER.info(instance.getUuid());
	}
	
}
