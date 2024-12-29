package com.Collections.Map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesClass {
	public static void main(String[] args) throws Exception {

		Properties p = new Properties();

		FileInputStream fis = new FileInputStream("application.properties");

//		4. void load(InputStream is);//Any InputStream we can pass.
//		To load Properties from property files into java Properties object
		p.load(fis);
		System.out.println(p);

		// Methods

//		1. String getPrperty(String propertyname) ; 
//		Returns the value associated with specified property.
		String s = p.getProperty("name");
		System.out.println(s);

		// 2.. String setproperty(String propertyname,String propertyvalue);
		// To set a new property.

		p.setProperty("chandu", "200000");

		String s1 = p.getProperty("chandu");
		System.out.println(s1);

		// 3. Enumeration propertyNames();
		Enumeration e = p.propertyNames();
		while (e.hasMoreElements()) {
			String s2 = (String) e.nextElement();
			System.out.println(s2);
		}

//	   5. void store(OutputStream os,String comment);//Any OutputStream we can pass. 
//		To store the properties from Properties object into properties file

		FileOutputStream fos = new FileOutputStream("application.properties");
		p.store(fos, "upadted by chandra");

	}

}
