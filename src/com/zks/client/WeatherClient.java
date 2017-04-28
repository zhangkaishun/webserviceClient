package com.zks.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.zks.server.WeatherInterfaceImpl;
/**
 * wsimport -keep url �����ɿͻ��˴���
 * @author Administrator
 *
 */
public class WeatherClient {

	public static void main(String[] args) {
		try {
			//wsdl url��ַ
			URL url=new URL("http://127.0.0.1:12345/weather.asmx?wsdl");
			// namespaceURL  --�����ռ��ַ
			// localPart     -- ������ͼ��
			QName qname = new QName("http://server.zks.com/","WeatherInterfaceImplService");
			//wsdlDocumentLocation     --wsdl��ַ
			//serviceName              --��������
			Service service=Service.create(url,qname);
			//��ȡ����ʵ����
			WeatherInterfaceImpl weatherInterfaceImpl = service.getPort(WeatherInterfaceImpl.class);
			//���ò�ѯ����
			System.out.println(weatherInterfaceImpl.queryWeather("�ɶ�"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
