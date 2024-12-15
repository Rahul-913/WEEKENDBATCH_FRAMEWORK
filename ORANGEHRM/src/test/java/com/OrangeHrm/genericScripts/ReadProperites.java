package com.OrangeHrm.genericScripts;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperites implements ApplicationConstants
{
	public Properties pro;
	ReadProperites() throws Exception
	{
		pro = new Properties();
		FileInputStream fis = new FileInputStream(PropertiesPath);
		pro.load(fis);
	}
	
	public String ReadUrl()
	{
		String testUrl = pro.getProperty("TestUrl");
		return testUrl;
	}
	public String ReadUsn()
	{
		String testUsn = pro.getProperty("TestUsn");
		return testUsn;
	}
	public String ReadPsw()
	{
		String testPsw = pro.getProperty("TestPsw");
		return testPsw;
		
	}

}
