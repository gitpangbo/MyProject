package org.kirito.multithreading.unit2.eg_2_1_6.two;

/***
 * Java Lib For MyProject, Powered By Kirito.
 * <p>
 * -----------------------------------------------------------------------------
 * <p>
 * 
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @version 1.0.0
 * @author pangbo
 * @createDate 2016年11月7日
 * @since JDK1.7
 */
public class Main {
	public int i = 10;
	synchronized public void operateIMainMethod(){
		try {
			i--;
			System.out.println("main print i = " + i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	synchronized public void service2(){
		System.out.println("service2");
		service3();
	}
	synchronized public void service3(){
		System.out.println("service3");
	}
	
}
