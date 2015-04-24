/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.core.cloud.hdfs;

import java.util.Map;

import org.apache.log4j.Logger;
import org.myclouddisk.common.LoggerUtil;
import org.myclouddisk.core.cloud.api.MyCloudDiskFileSystem;
/**
 * 
 * @author MingDing Li
 */
public class HDFSMyCloudDiskFileSystem implements MyCloudDiskFileSystem {
	protected Logger log = LoggerUtil.getLogger();

	public Map<String, Object> put(final Map<String, Object> file) {
		return null;
	}

	public Map<String, Object> download(final Map<String, Object> file) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> remove(final Map<String, Object> file) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> renameFile(final Map<String, Object> file) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> copy(final Map<String, Object> file) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> reFilePath(final Map<String, Object> file) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> makeDir(final Map<String, Object> file) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> removeDir(final Map<String, Object> file) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> reDirName(final Map<String, Object> file) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> reDirPath(final Map<String, Object> file) {
		// TODO Auto-generated method stub
		return null;
	}

}
