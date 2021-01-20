package net.lenhard.app;

import java.util.UUID;

public final class SingletonClass {
	private static String uuid = null;
	private static SingletonClass instance = null;

	private SingletonClass() {
		super();

		SingletonClass.uuid = UUID.randomUUID().toString();
	}
	

	/** 
	 * Get uuid of Singleton
	 * @return String
	 */
	public String getUuid() {
		return SingletonClass.uuid;
	}


	/** 
	 * Set uuid of Singleton
	 * @param uuid
	 */
	public static void setUuid(String uuid) {
		SingletonClass.uuid = uuid;
	}

	
	/** 
	 * Get instance of Singleton, if no one, instantiate it
	 * @return SingletonClass
	 */
	public static SingletonClass getInstance() {
		if (SingletonClass.uuid == null) {
			SingletonClass.instance = new SingletonClass();
		}

		return SingletonClass.instance;
	}

	
	/** 
	 * Set instance of Singleton
	 * @param instance
	 */
	public static void setInstance(SingletonClass instance) {
		SingletonClass.instance = instance;
	}

}
