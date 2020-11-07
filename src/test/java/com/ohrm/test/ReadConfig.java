package com.ohrm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;

	public ReadConfig() {

		prop = new Properties();
		File f = new File("./Configuration/config.properties");
		FileInputStream fs;

		try {
			fs = new FileInputStream(f);
			try {
				prop.load(fs);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public String getBrowser() {
		String browser = prop.getProperty("browser");
		return browser;

	}
	
	public String getURL() {
		String url = prop.getProperty("url");
		return url;
		
	}

}
