/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.core.db.api;

import java.util.Map;
/**
 * 
 * @author MingDing Li
 */
public interface MyCloudDiskDao {
	/** 用户登录 */
	public Map<String,Object> login(Map<String,String> parem);
	/** 用户注册 */
	public Map<String,Object> regist(Map<String,Object> parem);
}
