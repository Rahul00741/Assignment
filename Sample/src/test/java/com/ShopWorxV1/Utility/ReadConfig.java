package com.ShopWorxV1.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
static Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public static String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public static String getUsername()
	{
	String username=pro.getProperty("username");
	return username;
	}
	
	public static String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
}
