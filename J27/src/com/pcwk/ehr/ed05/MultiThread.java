package com.pcwk.ehr.ed05;

public class MultiThread extends Thread {


	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.printf("%s",new String("|"));
		}		
	}
	

}
