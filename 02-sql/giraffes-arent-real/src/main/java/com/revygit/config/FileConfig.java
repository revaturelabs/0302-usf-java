package com.revygit.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileConfig {
	private static String url;
	private static String username;
	private static String password;
	
	static {
		try {
			FileInputStream f = new FileInputStream("src/main/resources/connection.properties");
			Properties props = new Properties();
			props.load(f);
			username = props.getProperty("username");
			password = props.getProperty("password");
			url = props.getProperty("url");
			f.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		//this is an instance block
	}

	public static String getUrl() {
		return url;
	}

	public static String getUsername() {
		return username;
	}

	public static String getPassword() {
		return password;
	}
	
}
