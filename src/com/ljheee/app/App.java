package com.ljheee.app;
import com.ljheee.demo.QRCodeUtil;

public class App {

	public static void main(String[] args) throws Exception {
		
		//生成带logo 的二维码 
		String text = "http://my.csdn.net/ljheee";
		QRCodeUtil.encode(text, "11.JPG", "d:/WPS", true);
		
		//生成不带logo 的二维码
		String textt = "http://www.baidu.com";
		QRCodeUtil.encode(textt,"","d:/WPS",true);
		
		//指定二维码图片，解析返回数据
		System.out.println(QRCodeUtil.decode("D:/WPS/75040887.jpg"));
 
	}
}
