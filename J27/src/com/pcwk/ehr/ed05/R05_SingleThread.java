package com.pcwk.ehr.ed05;

public class R05_SingleThread {

	//main 쓰레드
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		
		for(int i=0;i<300;i++) {
			System.out.printf("%s",new String("-"));
		}
		
		System.out.println();
		
		for(int i=0;i<300;i++) {
			System.out.printf("%s",new String("|"));
		}
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간:"+(endTime-startTime));
	}

}
//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||소요시간:25