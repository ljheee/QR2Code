package com.ljheee.app;

import com.ljheee.demo.QRCodeUtil;

public class App {

	public static void main(String[] args) throws Exception {
		//生成带logo 的二维码 
		String text = "http://my.csdn.net/ljheee";
		QRCodeUtil.encode(text, "11.JPG", "d:/WPS", true);
		
		
		//生成不带logo 的二维码
//		String textt = "http://www.dans88.com.cn";
//        QRCodeUtil.encode(text,"","d:/MyWorkDoc",true);
 
	}
}
