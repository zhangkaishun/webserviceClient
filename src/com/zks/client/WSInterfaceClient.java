package com.zks.client;

import com.thinkgem.jeesite.modules.wsinterface.service.impl.WSIService;
import com.thinkgem.jeesite.modules.wsinterface.service.impl.WSIServiceImplService;

public class WSInterfaceClient {

	public static void main(String[] args) {
		StringBuffer sqlBuf = new StringBuffer();
		sqlBuf.append("[{'Code':'LA0100440000002001','Name':'1�Ų�','OrgCode':'LA0100440000002','OrgName':'֣�ݴ�����','GTMATypeCode':'001','GTMATypeName':'ƽ����','SubmitDate':'2003-08-29','Wall':'ש','Roof':'ש','Structure':'ש','Ground':'ש','DesignCapacity':5000,'ConfirmCapacity':5000,'OutLength':20,'OutWidth':20,'OutEavesHeight':20,'OutRoofHeight':20,'OutDiameter':20,'OutWallArea':20,'InLength':20,'InWidth':20,'InEavesHeight':20,'InStoreHeight':20,'InDiameter':20,'InVolume':20,'DoorNumber':10,'DoorHeight':10,'DoorWidth':10,'Memo':'1�Ų�'},"
				+ "{'Code':'LA0100440000002002','Name':'2�Ų�','OrgCode':'LA0100440000002','OrgName':'֣�ݴ�����','GTMATypeCode':'001','GTMATypeName':'ƽ����','SubmitDate':'2003-08-29','Wall':'ש','Roof':'ש','Structure':'ש','Ground':'ש','DesignCapacity':5000,'ConfirmCapacity':5000,'OutLength':20,'OutWidth':20,'OutEavesHeight':20,'OutRoofHeight':20,'OutDiameter':20,'OutWallArea':20,'InLength':20,'InWidth':20,'InEavesHeight':20,'InStoreHeight':20,'InDiameter':20,'InVolume':20,'DoorNumber':10,'DoorHeight':10,'DoorWidth':10,'Memo':'2�Ų�'}]");
		/* ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		 factory.setServiceClass(WSIService.class);
		 factory.setAddress("http://127.0.0.1:8070/zhny/ws/es/wsinterface");
		 WSIService client = (WSIService)factory.create();
		 System.out.println("Invoke sayHi()....");
		 System.out.println(client.sendLaStoreHouse(sqlBuf.toString()));*/
		
		WSIService service=new WSIServiceImplService().getWSIServiceImplPort();
		System.out.println(service.sendLaStoreHouse(sqlBuf.toString()));
		
		System.out.println(service.auth("lijie", "admin"));
	}

}
