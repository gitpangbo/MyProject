package org.kirito.javaImprove.reflect.factory.eg03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

//操作属性文件类
class Init {
	public static Properties getPro() throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		File f = new File("/fruit.properties");
		if (f.exists()) {
			pro.load(new FileInputStream(f));
		} else {
			pro.setProperty("apple", "Reflect.Apple");
			pro.setProperty("orange", "Reflect.Orange");
			pro.store(new FileOutputStream(f), "FRUIT CLASS");
		}
		return pro;
	}
}