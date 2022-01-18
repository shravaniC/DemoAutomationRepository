package com.sgtesting.actitimeassignments1;

import org.apache.log4j.Logger;

public class ForLoopsLogDemo {
	public static Logger log=Logger.getLogger("Testing Logs");
	public static void main(String[] args) {
		displayLogs();
	}
	
	private static void displayLogs() {
		log.info("For Loop Execution started here...");
		log.info("For Loop Execution started here...");
		log.info("For Loop Execution started here...");
		for(int i=20;i<=40;i++) {
			if(i%2==0) {
				log.info("Even Number :"+i);
			}
		}
		log.info("For Loop Execution ended here ...");
	}
}
