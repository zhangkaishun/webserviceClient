package com.zks.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.zks.server.WeatherInterfaceImpl;

public class WeatherClient {

	public static void main(String[] args) {
		try {
			URL url=new URL("http://127.0.0.1:12345/weather.asmx?wsdl");
			
			QName qname = new QName("http://server.zks.com/","WeatherInterfaceImplService");
			Service service=Service.create(url,qname);
			WeatherInterfaceImpl weatherInterfaceImpl = service.getPort(WeatherInterfaceImpl.class);
			System.out.println(weatherInterfaceImpl.queryWeather("³É¶¼"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
