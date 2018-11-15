package com.example.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
	
	@Override
	// WAS 기동 후 contextInitialized 실행
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("WAS 기동 ==> contextInitialized");
	}
	
	@Override
	// WAS 종료 전 contextInitialized 실행
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextInitialized ==> WAS 종료");
	}

}
