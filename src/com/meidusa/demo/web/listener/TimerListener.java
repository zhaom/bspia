package com.meidusa.demo.web.listener;

import java.util.Timer;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class TimerListener implements ServletContextListener {

	public static Logger log = Logger.getLogger(TimerListener.class);
	
	private Timer timer;
	
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		if (timer != null) {
            timer.cancel();
		}
		log.info("Timer destroy,please confirm it!");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		timer = new Timer(true);
		System.out.println("context:"+event.getServletContext());
		timer.scheduleAtFixedRate(new JobTimer(event.getServletContext()), 2*60*1000L, 10*60*1000L);
		log.info("timerListener initialized, scheduled delay 2m period 2h.");
	}

}
