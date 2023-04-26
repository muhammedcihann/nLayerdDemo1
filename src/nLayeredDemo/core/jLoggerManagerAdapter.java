package nLayeredDemo.core;

import nLayeredDemo.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements ILoggerService{

	@Override
	public void logToSystem(String message) {
		jLoggerManager manager = new jLoggerManager();
		manager.log(message);
	}

}
