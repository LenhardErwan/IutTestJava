package net.lenhard.app;

public final class App {
	private App() {}

	public static void main(String[] args) {
		PrimaryClass pc = new PrimaryClass();
		ChildrenClass cc = new ChildrenClass();

		pc.showText();
		cc.showText();
	}
}
