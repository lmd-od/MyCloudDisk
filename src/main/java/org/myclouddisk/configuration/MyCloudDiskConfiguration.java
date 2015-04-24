/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.configuration;

import javax.servlet.ServletContext;

import org.myclouddisk.core.MyCloudDisk;

/**
 * 
 * @author MingDing Li
 */
public class MyCloudDiskConfiguration {
    public static ServletContext context;
	public static boolean conf(ServletContext servletContext){
		boolean cfg = true;
		if(servletContext == null){
			cfg = false;
		}
		context = servletContext;
		
		/** Init MyCloud instanse*/
		MyCloudDisk.getInstanse();
		return cfg;
	}
	
}
