/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.web.controller;

import org.myclouddisk.core.MyCloudDisk;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author MingDing Li
 */
@Controller
@RequestMapping("/login")
public class LoginMyCloudDiskController extends MyCloudDiskController {
	
	@RequestMapping("/login.html")
	public ModelAndView login(){
		MyCloudDisk.getInstanse().getMyCloudService().login(null);
		log.error("登陆异常");
		return new ModelAndView("mycloudError");
	}
	
	
}
