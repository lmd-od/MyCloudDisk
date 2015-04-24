/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.core.service;

import java.util.Map;

import org.myclouddisk.core.service.MyCloudDiskService;
/**
 * 
 * @author MingDing Li
 */
public class DefaultMyCloudDiskService  extends MyCloudDiskService{
	
	@Override
	public Map<String, Object> login(Map<String, String> parem) {
		log.info("用户登陆");
		return super.login(parem);
	}

	@Override
	public Map<String, Object> regist(Map<String, Object> parem) {
		this.mcd_db.regist(parem);
		return null;
	}

	public Map<String, Object> initDB() {
		log.info("Init MyCloud datebase");
		
		return null;
	}

	public Map<String, Object> initFileSystem() {
		log.info("Init Mycloud File System");
		
		return null;
	}

}
