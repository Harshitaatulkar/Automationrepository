package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("./src/main/resources/confi.properties");
	Properties prop = new Properties();
	prop.load(fis);
	String data = prop.getProperty("url");
	System.out.println(data);
	}
}