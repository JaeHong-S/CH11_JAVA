package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 확장자가 properties로 되어있는 파일을 읽어서 처리할 때 사용
		// 키=값으로 구성
		Properties pts = new Properties();
		String path = // database.propeties가 있눈 파일의 위치와 이름
				PropertiesExample.class.getResource("database.properties").getPath();
		// utf-8 다국어, euc-kr한글과 영어
		// path = URLDecoder(path,"utf-8"); // 각국의 문자 해석
		pts.load(new FileReader(path));
		System.out.println("driver : " + pts.getProperty("driver"));
		System.out.println("url : " + pts.getProperty("url"));
		System.out.println("username : " + pts.getProperty("username"));
		System.out.println("password : " + pts.getProperty("password"));
	}
}