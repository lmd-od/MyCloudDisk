/*
 * Copyright (c) MyCloudDisk, LLC. All rights reserved. http://www.myclouddisk.org
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.myclouddisk.common;
/**
 * 
 * @author MingDing Li
 */
public class MyCloudDiskException extends RuntimeException{
	MyCloudDiskException(String msg){
		super(msg);
	}
	MyCloudDiskException(){
	}
	public static void stop(String msg){
		throw new MyCloudDiskException(msg);
	} 
}
