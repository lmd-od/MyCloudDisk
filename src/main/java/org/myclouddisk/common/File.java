/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.common;

import java.util.List;
/**
 * 
 * @author MingDing Li
 */
public class File {
	boolean isDirectory;
	String type;
	String name;
	String path;
	List<File> files;
	
}
