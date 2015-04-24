/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.common.util;


import org.myclouddisk.configuration.MyCloudDiskConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
/**
 * 
 * @author MingDing Li
 */
public class SpringUtil {
	public static Object getBean(String id){
	   ApplicationContext classContext = WebApplicationContextUtils.getWebApplicationContext(MyCloudDiskConfiguration.context);
	   return classContext.getBean(id);	
	}
	
}
