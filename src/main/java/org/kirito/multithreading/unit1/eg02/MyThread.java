package org.kirito.multithreading.unit1.eg02;

/***
 * Java Lib For MyProject, Powered By Kirito.
 * 
 * @version 1.0.0
 * @author pangbo
 * @Description TODO(用一句话描述该文件做什么)
 * @Copyright Copyright (c) 2012-2016
 * @Create 2016年9月14日
 */
public class MyThread extends Thread {
	private int i;
	
	public MyThread(int i) {
		// TODO Auto-generated constructor stub
		super();
		this.i = i;
	}
	@Override
	public void run() {
		System.out.println(i);
	}
}
