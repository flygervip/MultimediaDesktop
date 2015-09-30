/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wms.studio.domain.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author WMS
 * @version 4.2
 */
@SuppressWarnings("serial")
public class Movie implements Serializable {

	private long id;// 编号

	private String title;// 片名

	private String author;// 导演

	private String actor;// 主演

	private Date madetime;// 制作时间

	private String type;// 类型

	private int duration;// 时长

	private long size;// 文件大小

	private User user;// 上传用户

	private Date time;// 上传时间

	private String description;// 文件描述

	private String filename;// 文件名称

	private Boolean auditingStatu;

	public Movie() {
	}

	public Movie(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public Date getMadetime() {
		return madetime;
	}

	public void setMadetime(Date madetime) {
		this.madetime = madetime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @param filename
	 *            the filename to set
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Boolean getAuditingStatu() {
		return auditingStatu;
	}

	public void setAuditingStatu(Boolean auditingStatu) {
		this.auditingStatu = auditingStatu;
	}

}