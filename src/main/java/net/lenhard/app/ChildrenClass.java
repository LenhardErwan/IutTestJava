package net.lenhard.app;

import java.util.logging.Logger;

public class ChildrenClass extends PrimaryClass {

	public ChildrenClass() {
		super();
	}

	@Override
	public void showText() {
		Logger.getLogger(ChildrenClass.class.getName()).info("Ceci est la classe enfant");
	}
	
}
