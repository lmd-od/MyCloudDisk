/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.core.service;

import java.util.Map;

import org.apache.log4j.Logger;
import org.myclouddisk.common.LoggerUtil;
import org.myclouddisk.core.cloud.api.MyCloudDiskFileSystem;
import org.myclouddisk.core.db.api.MyCloudDiskDao;
/**
 * 
 * @author MingDing Li
 */
public class MyCloudDiskService implements org.myclouddisk.core.service.api.MyCloudDiskService{
	protected Logger log = LoggerUtil.getLogger();
	/** MyCloud 数据库连接器 */
	protected MyCloudDiskDao mcd_db;
	/** MyCloud 文件系统 */
	protected MyCloudDiskFileSystem mcd_fs;
	public MyCloudDiskDao getMcd_db() {
		return mcd_db;
	}
	public void setMcd_db(MyCloudDiskDao mc_db) {
		this.mcd_db = mcd_db;
	}
	public MyCloudDiskFileSystem getMcd_fs() {
		return mcd_fs;
	}
	public void setMcd_fs(MyCloudDiskFileSystem mc_fs) {
		this.mcd_fs = mcd_fs;
	}
	public Map<String, Object> login(final Map<String, String> parem) {
		return null;
	}

	public Map<String, Object> regist(final Map<String, Object> parem) {
		return null;
	}
	
	public Map<String, Object> initDB() {
		return null;
	}

	public Map<String, Object> initFileSystem() {
		return null;
	}
	
}
