/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.core.db.mysql;

import java.util.Map;

import org.apache.log4j.Logger;
import org.myclouddisk.common.LoggerUtil;
import org.myclouddisk.core.db.api.MyCloudDiskDao;
/**
 * 
 * @author MingDing Li
 */
public class MySqlMyCloudDiskDao implements MyCloudDiskDao {
	protected Logger log = LoggerUtil.getLogger();

	public Map<String, Object> login(final Map<String, String> parem) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> regist(final Map<String, Object> parem) {
		log.info("用户注册");
		return null;
	}

}
