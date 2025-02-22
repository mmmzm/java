package com.pcwk.ehr.ed01;
import java.io.*;


public class R02_FileCopy {

	public static void main(String[] args) {
		FileInputStream  fis = null;//파일 읽기
		FileOutputStream fos = null;//파일 쓰기
		
		try {
			if( args.length !=2) {
				System.out.println("원본파일명, copy파일명을 입력 하세요.");
				System.exit(0);
			}
			//D:\JAP_20249311\01_JAVA\WORKSPACE\J24\src\images\jpgImage.jpg
			//newImage.jpg
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			
			int data = 0;
			while( (data=fis.read()) !=-1) {
				fos.write(data);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(null != fos) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
		}
		System.out.println("-------------------------");
		System.out.println("-FileCopy 완료--");
		System.out.println("-------------------------");

	}

}
