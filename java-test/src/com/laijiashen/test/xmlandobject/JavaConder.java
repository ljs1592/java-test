package com.laijiashen.test.xmlandobject;

import java.beans.XMLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.laijiashen.Bean;

public class JavaConder {
	
	
	
	
	public static String objectXmlEncoder(Object map) throws IOException {
		
		Long start = System.currentTimeMillis();
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		XMLEncoder encoder = new XMLEncoder(baos);
		encoder.writeObject(map);
		encoder.close();
		
		String rtnVal = new String(baos.toByteArray(),"UTF-8");
		baos.close();
		
		Long end = System.currentTimeMillis();
		System.out.println(">>>>>>>>>>>>>>>>调用objectXmlDecoder()花费时间"+(end-start)+"毫秒");
		
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//		System.out.println(map);
		System.out.println(rtnVal);
//		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		return rtnVal;
	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		Map map = new HashMap<>();
		
		map.put("1", "11");
		
		Map map2 = new HashMap<>();
		
		for (int i = 0; i < 100; i++) {
			map2.put(i, i*10);
		}
		
		Object object = new Object();
		
		Bean bean = new Bean();
		
		bean.setName("111");
		bean.setAge(111);
		
		JavaConder.objectXmlEncoder(map.toString());
		
		JavaConder.objectXmlEncoder(map2);
		
		JavaConder.objectXmlEncoder(object);
		
		JavaConder.objectXmlEncoder(bean);
		
	}
	

}
