/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.web;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.myclouddisk.configuration.MyCloudDiskConfiguration;

/**
 * 
 * @author MingDing Li
 */
public class MyCloudDiskConfigurationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		/* MyCloud 启动初始配置 */
		boolean isCfg = MyCloudDiskConfiguration.conf(config.getServletContext());
	}
	
}
