package com.gmg.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseLogger {
	private Logger slf4jLogger = LoggerFactory.getLogger(this.getClass());
	
	public void logInfo(String log){
		slf4jLogger.info("DrIDMe Log INFO::   "+log);
	}
	
	public void logDebug(String log){
		slf4jLogger.debug("DrIDMe Log DEBUG::   "+log);
	}
	
	public void logError(String log){
		slf4jLogger.error("DrIDMe Log ERROR::   "+log);
	}
	
	public void logWarn(String log){
		slf4jLogger.warn("DrIDMe Log WARN::   "+log);
	}
	
	public void logTrace(String log){
		slf4jLogger.trace("DrIDMe Log WARN::   "+log);
	}

}
