/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.common;

import org.apache.log4j.Logger;
/**
 * 
 * @author MingDing Li
 */
public class LoggerUtil {
	private static String LOG_NAME = "log4j.properties";
	public static Logger getLogger(){
		return Logger.getLogger(LOG_NAME);
	}
}
