/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.core.cloud.api;

import java.util.Map;

/**
 * MyCloudDisk FileSystem
 * @author MingDing Li
 */
public interface MyCloudDiskFileSystem {
	/** 上传文件 */
	public Map<String,Object> put(Map<String,Object> file);
	/** 下载文件 */
	public Map<String,Object> download(Map<String,Object> file);
	/** 删除文件 */
	public Map<String,Object> remove(Map<String,Object> file);
	/** 修改文件名 */
	public Map<String,Object> renameFile(Map<String,Object> file);
	/** 复制文件 */
	public Map<String,Object> copy(Map<String,Object> file);
	/** 修改文件目录 */
	public Map<String,Object> reFilePath(Map<String,Object> file);
	/** 创建文件夹 */
	public Map<String,Object> makeDir(Map<String,Object> file);
	/** 删除文件夹 */
	public Map<String,Object> removeDir(Map<String,Object> file);
	/** 修改文件夹名 */
	public Map<String,Object> reDirName(Map<String,Object> file);
	/** 修改文件夹路径 */
	public Map<String,Object> reDirPath(Map<String,Object> file);
}
