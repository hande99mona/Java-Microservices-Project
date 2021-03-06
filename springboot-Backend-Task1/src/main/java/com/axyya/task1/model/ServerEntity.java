package com.axyya.task1.model;

import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.core.mapping.Document;

import nonapi.io.github.classgraph.json.Id;

@Document(collection = "severdata")
@Scope(scopeName = "prototype")
public class ServerEntity {

	@Id
	private String id;
	private String serverName;
	private String language;
    private String framework;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	public ServerEntity(String id, String serverName, String language, String framework) {
		super();
		this.id = id;
		this.serverName = serverName;
		this.language = language;
		this.framework = framework;
	}
	public ServerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ServerEntity [id=" + id + ", serverName=" + serverName + ", language=" + language + ", framework="
				+ framework + "]";
	}
    
	
}
