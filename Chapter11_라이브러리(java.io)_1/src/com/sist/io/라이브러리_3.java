package com.sist.io;

import java.io.*;

public class 라이브러리_3 {

	public static void main(String[] args) {
		File dir = new File("c:\\java_project");
		
//		if (!dir.exists()) {
//			dir.mkdir();
//			System.out.println("폴더가 생성되었습니다.");
//		} else {
//			System.out.println("이미 폴더가 존재합니다.");
//		}
		if (dir.exists()) {
			dir.delete();
			System.out.println("폴더가 삭제되었습니다.");
		} else {
			System.out.println("존재하지 않는 폴더입니다.");
		}
	}

}
