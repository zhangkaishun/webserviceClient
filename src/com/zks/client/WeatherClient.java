package com.zks.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.zks.server.WeatherInterfaceImpl;
/**
 * wsimport -keep url 来生成客户端代码
 * @author Administrator
 *
 */
public class WeatherClient {

	public static void main(String[] args) {
		try {
			//wsdl url地址
			URL url=new URL("http://127.0.0.1:12345/weather.asmx?wsdl");
			// namespaceURL  --命名空间地址
			// localPart     -- 服务视图名
			QName qname = new QName("http://server.zks.com/","WeatherInterfaceImplService");
			//wsdlDocumentLocation     --wsdl地址
			//serviceName              --服务名称
			Service service=Service.create(url,qname);
			//获取服务实现类
			WeatherInterfaceImpl weatherInterfaceImpl = service.getPort(WeatherInterfaceImpl.class);
			//调用查询方法
			System.out.println(weatherInterfaceImpl.queryWeather("成都"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
