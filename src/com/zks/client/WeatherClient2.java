package com.zks.client;

import com.zks.server.WeatherInterfaceImpl;
import com.zks.server.WeatherInterfaceImplService;

public class WeatherClient2 {

	public static void main(String[] args) {
		WeatherInterfaceImplService weatherInterfaceImplService=new WeatherInterfaceImplService();
		WeatherInterfaceImpl weatherInterfaceImplPort = weatherInterfaceImplService.getWeatherInterfaceImplPort();
		System.out.println(weatherInterfaceImplPort.queryWeather("³É¶¼"));

	}

}
