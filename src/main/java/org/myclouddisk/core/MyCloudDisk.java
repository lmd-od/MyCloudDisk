/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.core;


import org.apache.log4j.Logger;
import org.myclouddisk.common.LoggerUtil;
import org.myclouddisk.common.util.SpringUtil;
import org.myclouddisk.core.service.api.MyCloudDiskService;
/**
 * 
 * @author MingDing Li
 */
public class MyCloudDisk {
	protected Logger log = LoggerUtil.getLogger();
	private String MC_SERVICE_ID = "mcd_service";
	private static MyCloudDisk myCoud = null;
	private MyCloudDiskService myCloudService;
	private MyCloudDisk(){
		this.init();
	}
	public static MyCloudDisk getInstanse(){
		if(myCoud == null){
			myCoud = new MyCloudDisk();
		}
		return myCoud;
	}
	
	/** 初始化 MyCloud */
	private void init(){
		/* 初始化 MyCloudService 实列 */
		myCloudService = (MyCloudDiskService)SpringUtil.getBean(MC_SERVICE_ID);
		/* 初始化 MyCloudService 数据库 */
		myCloudService.initDB();
		/* 初始化 MyCloudService 文件系统 */
		myCloudService.initFileSystem();
	}
	
	/** 销毁 MyCloud */
	public void destroy(){
		
	}
	
	public MyCloudDiskService getMyCloudService() {
		return myCloudService;
	}
	
}
