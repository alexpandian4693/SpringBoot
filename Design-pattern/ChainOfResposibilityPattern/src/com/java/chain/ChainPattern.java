package com.java.chain;

public class ChainPattern {
	
	   private static Logger getChainOfLoggers(){

	      Logger errorLogger = new Error(Logger.ERROR);
	      Logger fileLogger = new File(Logger.DEBUG);
	      Logger consoleLogger = new Console(Logger.INFO);

	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);

	      return errorLogger;	
	   }

	   public static void main(String[] args) {
	      Logger loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(Logger.INFO, 
	         "This is an information.");

	      loggerChain.logMessage(Logger.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logMessage(Logger.ERROR, 
	         "This is an error information.");
	   }
	}
